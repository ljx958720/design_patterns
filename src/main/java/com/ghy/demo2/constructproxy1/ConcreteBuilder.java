package com.ghy.demo2.constructproxy1;

import com.ghy.demo2.constructproxy.ICarBuilder;
import lombok.Data;

/**
 * 具体建造者
 */
public class ConcreteBuilder {

    private  Car car=new Car();

    public ConcreteBuilder addWheel(String wheel){
        car.setWheel(wheel);
        return this;
    }
    public ConcreteBuilder addSkeleton(String skeleton){
        car.setSkeleton(skeleton);
        return this;
    }
    public ConcreteBuilder addEngine(String engine){
        car.setEngine(engine);
        return this;
    }

    public void buildWheel() {

    }


    public void buildSkeleton() {

    }


    public void buildEngine() {

    }


    public Car buildCar() {
        return this.car;
    }

    @Data
    public class Car {
        private String wheel;
        private String skeleton;
        private String engine;
    }




}
