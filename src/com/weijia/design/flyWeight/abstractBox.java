package com.weijia.design.flyWeight;

public abstract class abstractBox {
    public abstract String getShape();

    public void display(String name){
        System.out.println("·½¿éĞÎ×´"+this.getShape()+"ÑÕÉ«"+name);

    }
}
