package com.weijia.principle.syntheticMultiplexing;

public class client {
    public static void main(String[] args) {
        car c=new eleCar();
        color co =new red();
        c.setC(co);
        c.move();
    }
}
