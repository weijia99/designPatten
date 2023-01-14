package com.weijia.design.factory.factory;

public class americanFactory implements factory{
    @Override
    public coffee createCoffee() {
        return new american();
    }
}
