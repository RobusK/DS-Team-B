package com.kaniademianchuk.model.state;

public interface Turnonable {
    void turnOn();

    void turnOff();

    void toggle();

    boolean isOn();
}
