package com.weijia.design.factory.abstractFactory;

public class cake implements dessert{
    @Override
    public void getName() {
        System.out.println("this is cake");
    }
}
