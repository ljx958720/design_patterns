package com.ghy.demo5.bridge;

public class AirConditioner implements ElectricAppliance {

    private final String name = "空调";

    @Override
    public String description() {
        return name;
    }
}
