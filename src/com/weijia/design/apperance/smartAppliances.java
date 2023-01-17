package com.weijia.design.apperance;

//主要是聚合操作,只能
public class smartAppliances {
    private light light;
    private TV tv;

    public smartAppliances() {
        light=new light();
        tv=new TV();
//        直接新建一个
    }
    public void say(String msg){
        if(msg.equals("on")){
            on();
        } else if (msg.equals("off")) {
            off();
        }else {
            System.out.println("i have no idea");
        }
    }
    public void on(){
        tv.on();
        light.on();
    }
    public void off(){
        tv.off();
        light.off();
    }

}
