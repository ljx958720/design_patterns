package com.ghy.demo4.Interfaceadapter;
//Target接口
public interface Target {
    //将220V转换输出110V（原有插头（Adaptee）没有的）
    public void Convert_110v();

    public void Convert_10v();
}
