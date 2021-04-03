package com.ghy.demo1.shallow;

import lombok.Data;

import java.util.List;

/**
 * 具体原型（Concrete Prototype）:被拷贝的对象。
 */
@Data
public class ConcretePrototypeB implements Cloneable{
    private int age;
    private String name;
    private List hobbies;

    public ConcretePrototypeB(int age, String name, List hobbies){
        this.age=age;
        this.name=name;
        this.hobbies=hobbies;
    }


    @Override
    public ConcretePrototypeB clone() {
        return new ConcretePrototypeB(this.age,this.name,this.hobbies);
    }

    @Override
    public String toString() {
        return "ConcretePrototypeA{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
