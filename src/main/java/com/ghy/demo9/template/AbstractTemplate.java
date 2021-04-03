package com.ghy.demo9.template;
//抽象的模版类
public abstract  class AbstractTemplate {
    /**
     * 模版方法：顶层的统一实现逻辑，子类不能更改或者替换
     */
    public void templateMethod() {
        System.out.println("顶层模版类的模版方法");
        abstractMethod();
        hoodMethod();
        concreteMethod();
    }
    /**
     * 抽象方法：子类必须实现和替换的方法
     */
    public abstract void abstractMethod();

    /**
     * 钩子方法：子类可以选择性的实现或者不实现的方法
     */
    public void hoodMethod() {

    }

    /**
     * 基本方法：顶层模版类实现的方法，子类不能更改的方法
     */
    public void concreteMethod() {
        System.out.println("顶层模版类实现的具体方法");
    }
}
