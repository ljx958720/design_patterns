package com.ghy.demo2.constructproxy1;

import com.ghy.demo2.constructproxy.Car;
import com.ghy.demo2.constructproxy.CarDirector;

public class MainTest {
    public static void main(String[] args)
    {
        ConcreteBuilder concreteBuilder=new ConcreteBuilder()
                .addWheel("轮子")
                .addEngine("发动机")
                .addSkeleton("车身结构");
        System.out.println(concreteBuilder.buildCar());
    }
}
