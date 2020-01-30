package com.mja.carconfiguration.car;

import com.mja.carconfiguration.engine.Engine;

public interface Car {

    String getName();
    Engine getEngine();
    void setColor(String color);
    String getColor();
    void setWheelsSize(int wheelsSize);
    int getWheelsSize();

}
