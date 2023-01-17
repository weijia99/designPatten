package com.weijia.design.mediator;

public class tenant extends person{
    public tenant(String name, com.weijia.design.mediator.mediator mediator) {
        super(name, mediator);
    }

    @Override
    public void contact(String msg) {
        mediator.contact(msg,this);
    }
    public void getMsg(String msg){
        System.out.println("tenant: "+name+"msg"+msg);
    }
}
