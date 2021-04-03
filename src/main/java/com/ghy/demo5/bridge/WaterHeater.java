package com.ghy.demo5.bridge;

public class WaterHeater implements ElectricAppliance {

    private final String name = "热水器";

    @Override
    public String description() {
        return name;
    }
}
