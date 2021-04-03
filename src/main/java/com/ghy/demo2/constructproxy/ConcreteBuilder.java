package com.ghy.demo2.constructproxy;

/**
 * 具体建造者
 */
public class ConcreteBuilder implements ICarBuilder
{
    Car car;

    public ConcreteBuilder()
    {
        car = new Car();
    }

    @Override
    public void buildWheel()
    {
        car.setWheel("轮子");
    }

    @Override
    public void buildSkeleton()
    {
        car.setSkeleton("车身结构");
    }

    @Override
    public void buildEngine()
    {
        car.setEngine("发动机");
    }

    @Override
    public Car buildCar()
    {
        return this.car;
    }


}
