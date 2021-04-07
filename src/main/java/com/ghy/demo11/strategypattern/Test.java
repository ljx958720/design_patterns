package com.ghy.demo11.strategypattern;

public class Test {
    public static void main(String[] args) {
        DocTransition docTransition=new DocTransition();
        DwgTransition dwgTransition=new DwgTransition();
        boolean flag=true;
        if (flag){
            docTransition.transform();
        }else{
            dwgTransition.transform();
        }
    }
}
