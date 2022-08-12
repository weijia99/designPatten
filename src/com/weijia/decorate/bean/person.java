package com.weijia.decorate.bean;

public class person {
    String name;
    public person(){

    }
    public person(String name){
        this.name=name;
    }
//    Ï²»¶Iainshow²Ù×÷
    public void show(){
        System.out.println("decorate "+name);
    }
}
