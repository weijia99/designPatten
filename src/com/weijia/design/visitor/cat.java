package com.weijia.design.visitor;

public class cat implements animal{
    @Override
    public void accept(peroson p) {
        p.feed(this);
        System.out.println("cat yummy");
    }
}
