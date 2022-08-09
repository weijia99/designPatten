package com.weijia.strategy.bean;

public class strategyB extends strategy{
    private double rate;
    public strategyB(double rate){
        this.rate=rate;
    }
    @Override
    public double getAlgo(double money) {
        return money*rate;
    }
}
