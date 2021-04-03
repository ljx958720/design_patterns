package com.ghy.demo6.template;

//抽象享元角色
interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
