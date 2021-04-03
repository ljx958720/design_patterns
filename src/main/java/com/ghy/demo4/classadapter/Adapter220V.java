package com.ghy.demo4.classadapter;

//适配器（Adapter）
public class Adapter220V implements Target {

    private PowerPort220V powerPort220V;

    public Adapter220V(PowerPort220V powerPort220V){
        this.powerPort220V=powerPort220V;
    }
    //适配器在内部转换
    @Override
    public void Convert_110v() {
        int voltage=powerPort220V.Output_220v();
        System.out.println("拿到了原电压，下面开始转压");
        System.out.println("转接后的电压是"+voltage/2);
    }
}
