package com.weijia.design.visitor;

public class someone implements peroson{
    @Override
    public void feed(cat c) {
        System.out.println("someone feeding cat");
    }

    @Override
    public void feed(dog d) {
        System.out.println("someone feeding dog");

    }
}
