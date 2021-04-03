package com.ghy.demo2.constructproxy;

/**
 * 指导者
 */
public class CarDirector {
    public Car constructCar(ICarBuilder builder) {
        builder.buildEngine();
        builder.buildSkeleton();
        builder.buildWheel();
        return builder.buildCar();
    }
    }
