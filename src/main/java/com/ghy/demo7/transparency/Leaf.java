package com.ghy.demo7.transparency;
//叶子节点
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return this.name;
    }

}
