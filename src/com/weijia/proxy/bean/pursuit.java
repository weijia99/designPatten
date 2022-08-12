package com.weijia.proxy.bean;

public class pursuit implements GiveGift{
    schoolGirl s;
    public pursuit(schoolGirl s){
        this.s=s;
    }
    @Override
    public void giveDollar() {
        System.out.println(s.name+"give dollar");
    }

    @Override
    public void giveFlower() {
        System.out.println(s.name+"give flowers");
    }
}
