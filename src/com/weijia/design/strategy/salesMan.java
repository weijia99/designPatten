package com.weijia.design.strategy;


//这个就是分情况讨论,这就是策略模式
public class salesMan {
    private strategy strategy;

    public salesMan(com.weijia.design.strategy.strategy strategy) {
        this.strategy = strategy;
    }
    public void show(){
        strategy.show();
    }
}
