package com.ghy.demo4.Interfaceadapter;
//适配者（Adaptee）
public class PowerPort220V {
    //原有插头只能输出220V
    public int Output_220v(){
        int voltage=220;
        System.out.println("原有插头只能输出220V");
        return voltage;
    }
}
