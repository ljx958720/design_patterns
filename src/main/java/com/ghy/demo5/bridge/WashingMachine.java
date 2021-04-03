package com.ghy.demo5.bridge;

public class WashingMachine implements ElectricAppliance {

    private final String name = "洗衣机";

    @Override
    public String description() {
        return name;
    }
}
