package com.weijia.design.factory.abstractFactory;

public class franceFactory implements factory{
    @Override
    public coffee createCoffee() {
        return new latte();
    }

    @Override
    public dessert createDessert() {
        return new cookie();
    }
}
