package com.weijia.design.builder;

public class mobikeBuilder extends builder{
    @Override
    public void makeFrame() {
        bike.setFrame("mobike frame has built");
    }

    @Override
    public void makeSeat() {
        bike.setSeat("mobike seat has built");
    }

    @Override
    public com.weijia.design.builder.bike makeBike() {
        return bike;
    }
}
