package com.weijia.design.factory.simpleFactory;

public class latte implements coffee{
    @Override
    public void getName() {
        System.out.println("this is latte");
    }
}
