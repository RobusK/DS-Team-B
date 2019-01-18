package com.kaniademianchuk.model;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DeviceGroupTest {

    @Nested
    class NestedDeviceGroupTest {
        @Test
        void constructorTest() {
            DeviceGroup group1 = new DeviceGroup();
            assertNotNull(group1);
            assertEquals(0, group1.getSize());

            DeviceGroup group2 = new DeviceGroup(
                    new Device(1, "Smart bulb"),
                    new Device(2, "Smart switch"),
                    new Device(3, "Smart outlet"));
            assertNotNull(group2);
            assertEquals(3, group2.getSize());
        }
    }

    Device device1;
    Device device2;
    Device device3;
    DeviceGroup group;

    @BeforeEach
    void setUp() {
        group = new DeviceGroup();
        device1 = new Device(1, "Smart bulb");
        device2 = new Device(2, "Smart switch");
        device3 = new Device(3, "Smart outlet");
    }

    @Test
    void addDevice() {
        assertEquals(null, group.addDevice(device1));
        assertEquals(null, group.addDevice(device2));
        assertEquals(null, group.addDevice(device3));
    }

    @Test
    void removeDevice() {
        group.addDevice(device1);

        assertEquals(device1, group.removeDevice(device1));
    }

    @Test
    void getDeviceById() {
        group.addDevice(device3);

        assertEquals(device3, group.getDeviceById(3));
    }

    @Test
    void getSize() {
        assertEquals(0, group.getSize());

        group.addDevice(device2);
        group.addDevice(device3);

        assertEquals(2, group.getSize());
    }

    @Test
    void toStringTest() {
        group = new DeviceGroup(device1, device2);
        String test = "Id: 1, Name: Smart bulb" + System.lineSeparator() +
                "Id: 2, Name: Smart switch" + System.lineSeparator();

        assertTrue(group.toString().equals(test));
    }
}