package com.weijia.design.builder;

public abstract class builder {
    protected bike bike=new bike();
//    使用proto是为了让子类跨域继承
    public abstract void makeFrame();
    public abstract void makeSeat();
    public abstract bike makeBike();
}
