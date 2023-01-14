package com.weijia.design.singletonDesign;

//饿汉式，这个是在类加载的时候
public class demo2 {
//    使用静态代码块来实现
public static void main(String[] args) {
    single1 s1 = single1.getSingle1();
    single1 s2 = single1.getSingle1();
    System.out.println(s1==s2);
}
}
class single1{

    private static single1 single1;
    private single1(){}

    static {
        single1=new single1();
    }

    public static single1 getSingle1() {
        return single1;
    }
}
