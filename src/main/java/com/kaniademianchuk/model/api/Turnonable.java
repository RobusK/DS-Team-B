package com.kaniademianchuk.model.api;

public interface Turnonable {
    void turnOn();

    void turnOff();

    void toggle();

    boolean isOn();
}
