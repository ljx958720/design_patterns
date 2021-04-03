package com.ghy.demo8.delegate;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        new Robam().command("UI",new Delegate());
    }
}
