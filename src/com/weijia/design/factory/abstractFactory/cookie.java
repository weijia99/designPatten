package com.weijia.design.factory.abstractFactory;

public class cookie implements dessert{
    @Override
    public void getName() {
        System.out.println("this is cookie");
    }
}
