package com.ghy.demo1.shallow;

/**
 * 客户（Client）:客户类提出创建对象的请求
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype){ this.prototype = prototype; }
    public Prototype startClone(Prototype prototype){
        return (Prototype)prototype.clone();
    }
}
