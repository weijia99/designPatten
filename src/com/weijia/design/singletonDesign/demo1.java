package com.weijia.design.singletonDesign;

public class demo1 {
//    传统的单例模式，只能返回一个例子
//    饿汉式，是直接在类加载的时候进行创建
public static void main(String[] args) {
    single single1 = single.getInstance();
    single single2 = single.getInstance();
    System.out.println(single2==single1);
}
}
class single{
    private static single s1=new single();
//    因为是静态的，所以可以在类加载的时候就进行创建
    private single(){}
//    私有构造方法，这样外面的不会进行创建
    public static single getInstance(){
//        s1=new single();
        return s1;
    }
}
