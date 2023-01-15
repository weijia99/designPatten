package com.weijia.design.proxy;

public class station implements sellTicket{
    @Override
    public void sell() {
        System.out.println("station sell ticket");
    }
}
