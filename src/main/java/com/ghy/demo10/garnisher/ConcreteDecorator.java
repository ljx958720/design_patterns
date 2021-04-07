package com.ghy.demo10.garnisher;

//具体装饰角色
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod(){
        System.out.println("定义自己的修饰逻辑");
    }

    // 重写父类的方法
    public void cost(){
        this.decorateMethod();
        super.cost();
    }
}
