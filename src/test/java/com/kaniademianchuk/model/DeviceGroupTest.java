package com.kaniademianchuk.model;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeviceGroupTest {

    Device device1;
    Device device2;
    Device device3;
    Device device4;
    Device device5;
    DeviceGroup group;

    @BeforeEach
    void setUp() {
        group = new DeviceGroup();
        device1 = new Device(1, "Smart bulb");
        device2 = new Device(2, "Smart switch");
        device3 = new Device(3, "Smart outlet");
        device4 = new Device(4, "Smart doorbell");
        device5 = new Device(5, "Smart thermostat");
    }

    @Test
    void addDevice() {
        assertEquals(null, group.addDevice(device1));
        assertEquals(null, group.addDevice(device2));
        assertEquals(null, group.addDevice(device3));
        assertEquals(null, group.addDevice(device4));
        assertEquals(null, group.addDevice(device5));
    }

    @Test
    void removeDevice() {
        assertEquals(null, group.removeDevice(device1));
        group.addDevice(device1);
        assertEquals(device1, group.removeDevice(device1));
    }

    @Test
    void describeDevices() {

    }

    @Test
    void getDeviceById() {
    }

    @Test
    void getSize() {
    }
}