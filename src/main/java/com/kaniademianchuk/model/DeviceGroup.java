package com.kaniademianchuk.model;

import java.util.*;

public class DeviceGroup {
    private final Map<Integer, Device> devices = new HashMap<>();

    public DeviceGroup() {
    }

    public DeviceGroup(Device... devices) {
        this();
        for (Device device : devices)
            this.devices.put(device.getId(), device);
    }

    public Device addDevice(Device device) {
        return this.devices.put(device.getId(), device);
    }

    public Device removeDevice(Device device) {
        return this.devices.remove(device.getId());
    }

    public Device getDeviceById(long id) {
        return this.devices.get(id);
    }

    public int getSize() {
        return devices.size();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (Device device : this.devices.values()) {
            buffer.append(device.toString());
            buffer.append(System.lineSeparator());
        }
        return buffer.toString();
    }
}
