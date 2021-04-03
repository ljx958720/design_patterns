package com.ghy.demo7.safety;

import com.ghy.demo7.safety.Component;

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
