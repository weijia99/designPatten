package com.weijia.design.visitor;

//home是作为联系动物还有任务的地点
//
public class client {
    public static void main(String[] args) {
        home h=new home();
        h.add(new dog());
        h.add(new cat());

        owner o=new owner();
        h.action(o);

    }
}
