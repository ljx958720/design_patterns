package com.ghy.demo1.shallow;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) {
//        List hobbies = new ArrayList<String>();
//
//        // 创建一个具体的需要克隆的对象
//        ConcretePrototypeA concretePrototype = new ConcretePrototypeA(18, "prototype", hobbies);
//        // 填充属性，方便测试
//        System.out.println(concretePrototype);
//
//        // 创建 Client 对象，准备开始克隆
//        Client client = new Client(concretePrototype);
//        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
//        System.out.println(concretePrototypeClone);
//        System.out.println(concretePrototypeClone==concretePrototype);
//        System.out.println("克隆对象中的引用类型地址值：" + concretePrototypeClone.getHobbies());
//        System.out.println("原对象中的引用类型地址值：" + concretePrototype.getHobbies());
//        System.out.println("对象地址比较："+(concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(11);
        concretePrototype.setName("张三");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("没变化");
        concretePrototype.setHobbies(hobbies);
        // 创建一个具体的需要克隆的对象

        // 创建 Client 对象，准备开始克隆
        ConcretePrototypeA concretePrototypeClone = concretePrototype.clone();
        // 填充属性，方便测试
        concretePrototypeClone.getHobbies().add("有变化");
        System.out.println(concretePrototype);
        System.out.println(concretePrototypeClone);

    }
}
