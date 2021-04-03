package com.ghy.demo1.shallow;

import lombok.Data;

import java.util.List;

/**
 * 具体原型（Concrete Prototype）:被拷贝的对象。
 */
@Data
public class ConcretePrototypeA implements Cloneable{
    private int age;
    private String name;
    private List<String> hobbies;


    @Override
    public ConcretePrototypeA clone() {
        try {
            return (ConcretePrototypeA) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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
