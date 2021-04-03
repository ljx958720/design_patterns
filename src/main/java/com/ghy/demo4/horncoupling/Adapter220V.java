package com.ghy.demo4.horncoupling;
//适配器（Adapter）
public class Adapter220V  extends PowerPort220V implements Target{
    //适配器在内部转换
    @Override
    public void Convert_110v() {
        int voltage=this.Output_220v();
        System.out.println("拿到了原电压，下面开始转压");
        System.out.println("转接后的电压是"+voltage/2);
    }
}
