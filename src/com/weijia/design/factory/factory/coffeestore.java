package com.weijia.design.factory.factory;

public class coffeestore {
    private factory factory;

    public coffeestore(factory factory) {
        this.factory = factory;
    }
    public coffee createCoffee(){
        coffee coffee = factory.createCoffee();
        return coffee;
    }
}
