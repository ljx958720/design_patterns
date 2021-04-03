package com.ghy.demo3.cglibdynamic;



public class CglibProxyTest {
    public static void main(String[] args) {

        try {
            Accomplish  accomplish = (Accomplish)new CglibProxy().getInstance(Accomplish.class);
            accomplish.accomplish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
