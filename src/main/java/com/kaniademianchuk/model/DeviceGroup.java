package com.kaniademianchuk.model;

import java.util.*;

public class DeviceGroup {
    private Map<Long, Device> devices;

    public DeviceGroup() {
        this.devices = new HashMap<>();
    }

    public DeviceGroup(Device... devices) {
        for (Device device : devices)
            this.devices.put(device.getId(), device);
    }

    public Device addDevice(Device device) {
        return this.devices.put(device.getId(), device);
    }

    public Device removeDevice(Device device) {
        return this.devices.remove(device.getId());
    }

    public void describeDevices() {
        for (Device device : this.devices.values())
            device.describe();
    }

    public Device getDeviceById(long id) {
        return this.devices.get(id);
    }

    public int getSize() {
        return devices.size();
    }
}
