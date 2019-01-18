package com.kaniademianchuk.model;

import java.util.Objects;

public class Device {
    private final long id;
    private String name;

    public Device(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id &&
                Objects.equals(name, device.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name;
    }
}
