package com.ghy.demo1.deep;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * 深拷贝，增加一个deepClone()方法
 */
@Data
public class ConcretePrototypeA implements Cloneable, Serializable {
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

    public ConcretePrototypeA deepClone(){
        try {
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            ObjectOutputStream oos= new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);
            return (ConcretePrototypeA) ois.readObject();
        }catch (Exception e){
             e.printStackTrace();
            return null;
        }
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
