package com.ghy.demo2.constructproxy;

public class MainTest {
    public static void main(String[] args)
    {
        CarDirector director = new CarDirector();
        Car car = director.constructCar(new ConcreteBuilder());
        System.out.println(car.getWheel());
        System.out.println(car.getEngine());
        System.out.println(car.getSkeleton());
    }
}
