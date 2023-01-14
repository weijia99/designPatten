package com.weijia.principle.LSPPrinciple.Rectangle1;

/*
父类不重写子类的方法，例如正方形不是长方形，这个例子，
使用这个函数setwidth函数，会让场合宽一样，这样就一直循环
 */
public class demo {
    public static void main(String[] args) {
        rectangle r=new rectangle(20,10);
        while(r.getHeight()<=r.getWidth()){
            r.setWidth(r.getWidth()-1);
        }
        System.out.println(r.getHeight()+" "+r.getWidth());
    }

}
