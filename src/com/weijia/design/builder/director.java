package com.weijia.design.builder;

public class director {
    private builder builder;

    public director(com.weijia.design.builder.builder builder) {
        this.builder = builder;
    }
    public bike construct(){
        builder.makeSeat();
        builder.makeFrame();
        bike bike = builder.makeBike();
        return bike;
    }
}
