package com.weijia.principle.syntheticMultiplexing;

public class eleCar extends car{
    @Override
    public void move() {
//        super.move();
        this.getC().getName();
        System.out.println("with eleCar");
    }
}
