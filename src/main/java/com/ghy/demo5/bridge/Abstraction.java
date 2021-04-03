package com.ghy.demo5.bridge;

public class Abstraction {
    private ElectricAppliance electricAppliance;
    private Brand brand;

    public void setElectricAppliance(ElectricAppliance electricAppliance) {
        this.electricAppliance = electricAppliance;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
