package com.ghy.demo1.deep;

public class ConcretePrototypeTest {
    public static void main(String[] args) {
        //创建原型对象
        ConcretePrototype concretePrototype=ConcretePrototype.getInstance();

        //复制原型对象
        ConcretePrototype cloneType=concretePrototype.clone();
        System.out.println(concretePrototype==cloneType);
    }
}
