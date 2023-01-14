package com.weijia.design.singletonDesign;

//双重检查法
//第一次检查是不是null，第二次在加上同步，然后使用instance创建
public class demo5 {
}

class single5{
    private static single5 s5;
    private single5(){}

    public static  single5 getInstance(){
        if (s5== null) {
            synchronized (single5.class){
                if (s5 == null) {
                    s5=new single5();
                }
            }
        }
        return s5;
    }
}