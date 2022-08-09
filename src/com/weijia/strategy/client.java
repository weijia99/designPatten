package com.weijia.strategy;

//策略模式，只需要记住一个变量，
//工厂模式需要记住工厂和bean类
public class client {
    public static void main(String[] args) {
        strategyContext sc=new strategyContext("refund");
        System.out.println(sc.getMoney(301));
    }
}
