package com.ghy.demo6.template;

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight f01 = factory.getFlyweight("报告1");
        Flyweight f02 = factory.getFlyweight("报告1");
        Flyweight f03 = factory.getFlyweight("报告1");
        Flyweight f11 = factory.getFlyweight("报告2");
        Flyweight f12 = factory.getFlyweight("报告2");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用报告1。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用报告1。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用报告1。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用报告2。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用报告2。"));
    }
}
