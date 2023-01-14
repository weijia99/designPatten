package com.weijia.principle.syntheticMultiplexing;

public class gasCar extends car{
    @Override
    public void move() {
//        super.move();
        this.getC().getName();
        System.out.println("with gas car");
    }
}
