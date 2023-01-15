package com.weijia.design.proxy;

public class proxySeller implements sellTicket{
    private station s1=new station();
    @Override
    public void sell() {
        System.out.println("proxy sell ticket");
        s1.sell();
    }
}
