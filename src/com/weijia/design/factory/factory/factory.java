package com.weijia.design.factory.factory;

//本文思路是建立不同的工厂来进行得到生产咖啡
//在客户端选择咖啡店，还有咖啡工厂
public interface factory {
    public coffee createCoffee();
}
