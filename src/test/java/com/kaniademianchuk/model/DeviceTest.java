package com.kaniademianchuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    Device device;

    @BeforeEach
    void setUp(){
        device = new Device(1, "Smart bulb");
    }

    @Test
    void getId() {
        assertEquals(1, device.getId());
    }

    @Test
    void getName() {
        assertEquals("Smart bulb", device.getName());
    }

    @Test
    void equals() {
        assertEquals(device, new Device(1, "Smart bulb"));
    }

    @Test
    void hashCodeTest() {
        Device testDevice = new Device(1, "Smart bulb");

        assertEquals(device.hashCode(), testDevice.hashCode());
    }

    @Test
    void toStringTest() {
        String test = "Id: 1, Name: Smart bulb";

        assertEquals(test, device.toString());
    }
}