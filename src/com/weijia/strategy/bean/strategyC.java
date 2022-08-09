package com.weijia.strategy.bean;

public class strategyC extends strategy{
    @Override
    public double getAlgo(double money) {
//        返利打折
        if(money>300){
            money-=100;
        }
        return money;
    }
}
