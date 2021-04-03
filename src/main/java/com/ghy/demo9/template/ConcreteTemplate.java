package com.ghy.demo9.template;
//具体的模版类
public class ConcreteTemplate  extends AbstractTemplate{

    @Override
    public void abstractMethod() {
        System.out.println("子类实现的抽象方法");
    }

    @Override
    public void hoodMethod() {
        // TODO Auto-generated method stub
        System.out.println("子类更改的钩子方法");
    }

}
