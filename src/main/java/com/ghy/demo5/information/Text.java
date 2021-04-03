package com.ghy.demo5.information;

public class Text {
    public static void main(String[] args) {
        IMessage iMessage=new PhoneMessage();
        Abstraction abstraction=new CommonAbstraction(iMessage);
        abstraction.send("正常开闸","张工");


    }
}
