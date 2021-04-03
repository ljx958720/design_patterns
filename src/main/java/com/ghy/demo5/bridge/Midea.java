package com.ghy.demo5.bridge;

public class Midea extends Brand{

    private final  String name = "美的";



    @Override
    public String description() {
        return name ;
    }
}
