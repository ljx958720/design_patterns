package com.ghy.demo5.bridge;

public class Gree extends Brand {

    private final  String name = "格力";



    @Override
    public String description() {
        return name ;
    }
}
