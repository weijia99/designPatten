package com.weijia.design.mediator;

public class owner extends person{
    public owner(String name, com.weijia.design.mediator.mediator mediator) {
        super(name, mediator);
    }
    public void contact(String msg){
        //调用传递的中介,通过中介方法进行联系
        mediator.contact(msg,this);
    }
    public void getMsg(String msg){
        System.out.println("owner: "+name+"msg"+msg);
    }
}
