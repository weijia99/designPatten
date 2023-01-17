package com.weijia.design.visitor;

public class dog implements animal{
    @Override
    public void accept(peroson p) {
        p.feed(this);
        System.out.println("dog yummy");
    }
}
