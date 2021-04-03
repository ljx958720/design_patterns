package com.ghy.demo2.constructproxy;

/**
 *  抽象建造者
 */
public interface ICarBuilder {
    public void buildWheel();
    public void buildSkeleton();
    public void buildEngine();

    Car buildCar();
}
