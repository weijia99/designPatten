package com.weijia.design.factory.abstractFactory;

//抽象工厂是直接用工厂来生产多个产品

public class client {
    public static void main(String[] args) {
        factory factory=new americanFactory();
        coffee coffee = factory.createCoffee();
        dessert dessert = factory.createDessert();
        coffee.getName();
        dessert.getName();
    }
}
