package com.weijia.strategy.bean;

public class strategyC extends strategy{
    @Override
    public double getAlgo(double money) {
//        θΏε©ζζ
        if(money>300){
            money-=100;
        }
        return money;
    }
}
