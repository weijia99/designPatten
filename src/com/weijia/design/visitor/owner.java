package com.weijia.design.visitor;

public class owner implements peroson{
    @Override
    public void feed(cat c) {
        System.out.println("owner feeding cat");
//        c.accept(this);
    }

    @Override
    public void feed(dog d) {
        System.out.println("owner feeding dog");

    }
}
