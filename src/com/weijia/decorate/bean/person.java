package com.weijia.decorate.bean;

public class person {
    String name;
    public person(){

    }
    public person(String name){
        this.name=name;
    }
//    ϲ��Iainshow����
    public void show(){
        System.out.println("decorate "+name);
    }
}
