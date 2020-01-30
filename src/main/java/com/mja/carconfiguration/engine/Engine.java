package com.mja.carconfiguration.engine;

public interface Engine {

    EEngineType getType();
    String getName();
    int getHersepower();
    String getTransmission();
    int getCC();

}
