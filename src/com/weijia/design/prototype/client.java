package com.weijia.design.prototype;

//使用序列化就跨域是深度拷贝
public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        realizeType r1=new realizeType();
//        realizeType r2 = r1.clone();
//        System.out.println(r1==r2);
//        下面这个是深克隆
        student student=new student("xiao wang",18);
        citation c1=new citation(student);
        citation c2 = c1.clone();
        student s2=c2.getStudent();
        s2.setName("xiao ming");
        System.out.println(student==s2);
        c1.show();
        c2.show();
    }
}
