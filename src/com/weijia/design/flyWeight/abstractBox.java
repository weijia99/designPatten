package com.weijia.design.flyWeight;

public abstract class abstractBox {
    public abstract String getShape();

    public void display(String name){
        System.out.println("������״"+this.getShape()+"��ɫ"+name);

    }
}
