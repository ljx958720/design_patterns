package com.ghy.demo1.deep;

import java.util.ArrayList;
import java.util.List;

public class ConcretaPrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA concretePrototypeA=new ConcretePrototypeA();
        concretePrototypeA.setAge(11);
        concretePrototypeA.setName("张三");
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("没变化");
        concretePrototypeA.setHobbies(hobbies);
        // 创建一个具体的需要克隆的对象

        // 创建 Client 对象，准备开始克隆
        ConcretePrototypeA concretePrototypeClone = concretePrototypeA.deepClone();
        // 填充属性，方便测试
        concretePrototypeClone.getHobbies().add("有变化");
        System.out.println(concretePrototypeA==concretePrototypeClone);
        System.out.println(concretePrototypeA);
        System.out.println(concretePrototypeClone);
        System.out.println(concretePrototypeA.getHobbies()==concretePrototypeClone.getHobbies());
    }
}
