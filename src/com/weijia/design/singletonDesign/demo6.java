package com.weijia.design.singletonDesign;

public class demo6 {

    private demo6(){}

    private static class SingleHolder{
        private static final demo6 s6 =new demo6();

    }
    public static demo6 getInstance(){
        return SingleHolder.s6;
//        使用内部类进行创建
    }

}



