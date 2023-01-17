package com.weijia.design.mediator;

public abstract class person {
    protected String name;
    protected mediator mediator;

    public person(String name, com.weijia.design.mediator.mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void contact(String msg);
}
