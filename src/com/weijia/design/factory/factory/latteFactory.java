package com.weijia.design.factory.factory;

public class latteFactory implements factory{
    @Override
    public coffee createCoffee() {
        return new latte();
    }
}
