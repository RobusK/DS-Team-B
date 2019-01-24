package com.kaniademianchuk.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    Device device;

    @BeforeEach
    void setUp(){

        device = new Device.Builder().setId(1).setName("Smart bulb").setOn(true).build();
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
        assertEquals(device, new Device.Builder().setId(1).setName("Smart bulb").setOn(true).build());
    }

    @Test
    void hashCodeTest() {
        Device testDevice = new Device.Builder().setId(1).setName("Smart bulb").setOn(true).build();

        assertEquals(device.hashCode(), testDevice.hashCode());
    }

    @Test
    void toStringTest() {
        String test = "Id: 1, Name: Smart bulb";

        assertEquals(test, device.toString());
    }

//    @Test
//    void turnOnTurnedOff() {
//        device.turnOn();
//
//        assertEquals(true, device.isOn());
//    }
//
//    @Test
//    void turnOnTurnedOn() {
//        Device device = new Device(0, "Turned on bulb", true);
//
//        device.turnOn();
//
//        assertEquals(true, device.isOn());
//    }
//
//    @Test
//    void turnOffTurnedOff() {
//        device.turnOff();
//
//        assertEquals(false, device.isOn());
//    }
//
//    @Test
//    void turnOffTurnedOn() {
//        Device device = new Device(0, "Turned on bulb", true);
//
//        device.turnOff();
//
//        assertEquals(false, device.isOn());
//    }
//
//    @Test
//    void toggle() {
//        device.toggle();
//        boolean firstState = device.isOn();
//        device.toggle();
//        boolean secondState = device.isOn();
//
//        assertEquals(true, firstState);
//        assertEquals(false, secondState);
//    }

    @Test
    void isOn() {
        assertEquals(false, device.isOn());
    }
}