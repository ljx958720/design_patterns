package com.ghy.demo10.garnisher;

public class DecoratorDemo {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        // 第一次修饰，比如，加一个花边
        component = new ConcreteDecorator(component);
        // 第二次修饰，比如，加一个图片
        component = new ConcreteDecorator(component);
        // 修饰后运行，将所有加一起
        component.cost();
    }
}
