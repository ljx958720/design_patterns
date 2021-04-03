package com.ghy.demo1.deep;

/**
 * 破坏单例示例
 */
public class ConcretePrototype implements Cloneable{
    private static ConcretePrototype concretePrototype=new ConcretePrototype();
    private ConcretePrototype(){}

    public static ConcretePrototype getInstance(){
        return concretePrototype;
    }
    public ConcretePrototype clone(){
        try {
            return (ConcretePrototype) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
