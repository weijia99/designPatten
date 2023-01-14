package com.weijia.design.singletonDesign;

//懒汉式，这个是在运行时才会创建
public class demo3 {
    public static void main(String[] args) {
        single3 s1 = single3.getInstance();
        single3 s2 = single3.getInstance();
        System.out.println(s1==s2);
    }
}

class single3{
    private static single3 s3;
    private single3(){}

    public static single3 getInstance(){
        if (s3 == null) {
            s3=new single3();
        }
        return s3;
    }
}
