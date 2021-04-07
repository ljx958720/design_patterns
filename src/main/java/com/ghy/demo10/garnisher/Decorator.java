package com.ghy.demo10.garnisher;
//抽象装饰角色
public abstract class Decorator  extends Component{
    private Component component = null;
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void cost(){
        this.component.cost();
    }
}
