package com.weijia.design.template;

public abstract class abstractVeg {
    public void pour(){
        System.out.println("pour oil");
    }
    public void heatOil(){
        System.out.println("heat oil");
    }
    public abstract void putVeg();
    public void run(){
        pour();
        heatOil();
        putVeg();
    }
}
