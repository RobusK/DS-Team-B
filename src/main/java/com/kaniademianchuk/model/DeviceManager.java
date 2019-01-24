package com.kaniademianchuk.model;


import com.kaniademianchuk.model.api.SmartDeviceApi;

import java.util.*;

public class DeviceManager implements SmartDeviceApi {

    private Map<Integer, Device> allDevices = new HashMap<Integer, Device>();
    private int latestId = 0;

    @Override
    public Optional<Integer> addDevice(Device.Builder deviceBuilder) {
        if (!deviceBuilder.readyToBeAdded()) {
            return Optional.empty();
        }
        int id = this.latestId++;
        deviceBuilder.setId(id);
        this.allDevices.put(id, deviceBuilder.build());
        return Optional.of(id);
    }

    @Override
    public boolean updateDevice(int id, Device.Builder deviceBuilder) {
        Device prev = this.allDevices.get(id);
        if (prev == null) {
            return false;
        }
        Device.Builder builder = new Device.Builder(deviceBuilder);
        if (!builder.getName().isPresent()) {
            builder.setName(prev.getName());
        }
        if (!builder.isOn().isPresent()) {
            builder.setOn(prev.isOn());
        }
        this.allDevices.put(id, builder.build());
        return true;
    }

    @Override
    public boolean removeDevice(int id) {
        if (!this.allDevices.containsKey(id)) {
            return false;
        }
        this.allDevices.remove(id);
        return true;
    }

    @Override
    public Collection<Device> getAllDevices() {
        return Collections.unmodifiableCollection(this.allDevices.values());
    }
}
