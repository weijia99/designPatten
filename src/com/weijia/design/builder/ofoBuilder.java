package com.weijia.design.builder;

public class ofoBuilder extends builder{
    @Override
    public void makeFrame() {
        bike.setFrame("ofo frame has built");
//        System.out.println();
    }

    @Override
    public void makeSeat() {
        bike.setSeat("ofo seat has built");
    }

    @Override
    public com.weijia.design.builder.bike makeBike() {
        return bike;
    }
}
