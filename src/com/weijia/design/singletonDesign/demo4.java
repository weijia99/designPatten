package com.weijia.design.singletonDesign;

//这个是安全的，刚刚那个会有同步问题
public class demo4 {
    public static void main(String[] args) {
        single4 s1 = single4.getInstance();
        single4 s2 = single4.getInstance();
        System.out.println(s1==s2);
    }
}
class single4{
    private static single4 s4;
    private single4(){}

    public static synchronized single4 getInstance(){
        if (s4== null) {
            s4=new single4();
        }
        return s4;
    }
}
