package com.weijia.design.apperance;


//外观模式,就是找了个保姆,你让他处理所有的事
//你给他下命令,他把任务全 做了
public class client {
    public static void main(String[] args) {
        smartAppliances sm=new smartAppliances();
        sm.say("on");
        sm.say("off");
    }
}
