package com.ghy.demo5.bridge;

public class Haier extends Brand{

    private final  String name = "海尔";


    @Override
    public String description() {
        return name  ;
    }
}
