package com.weijia.design.factory.factory;

//工厂模式，是吧咖啡店，还有工厂都放进来，然后再进行生产
public class client {
    public static void main(String[] args) {
        factory factory=new latteFactory();

        coffeestore cs =new coffeestore(factory);
        coffee coffee = cs.createCoffee();
        coffee.getName();
    }
}
