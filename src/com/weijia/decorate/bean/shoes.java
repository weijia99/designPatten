package com.weijia.decorate.bean;

public class shoes extends clothes{


    @Override
    public void show() {
        System.out.println("shoes");
        this.p.show();
    }
}
