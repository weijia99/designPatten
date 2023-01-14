package com.weijia.design.factory.abstractFactory;

public class americanFactory implements factory{
    @Override
    public coffee createCoffee() {
        return new american();
    }

    @Override
    public dessert createDessert() {
        return new cake();
    }
}
