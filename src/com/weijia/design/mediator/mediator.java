package com.weijia.design.mediator;


//中介模式,就是让中介与租房与房主进行沟通
public abstract class mediator {
    public abstract void contact(String msg,person person);
}
