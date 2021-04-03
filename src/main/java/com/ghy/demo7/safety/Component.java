package com.ghy.demo7.safety;
// 抽象根节点
public abstract  class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract String operation();



}
