package com.kaniademianchuk.model;

import com.kaniademianchuk.model.state.Turnonable;

import java.util.Objects;

public class Device implements Turnonable {
    private final long id;
    private String name;
    private boolean isOn;

    public Device(long id, String name) {
        this.id = id;
        this.name = name;
        this.isOn = false;
    }

    public Device(long id, String name, boolean isOn) {
        this(id, name);
        this.isOn = isOn;
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

    @Override
    public void turnOn() {
        this.isOn = true;
    }

    @Override
    public void turnOff() {
        this.isOn = false;
    }

    @Override
    public void toggle() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
