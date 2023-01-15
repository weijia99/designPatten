package com.weijia.design.adapter;


/*
因为电脑只能认sd卡,所以适配器也要实现接口,但是要吧tf的数据传入到tf,因此使用继承
 */
public class client {
    public static void main(String[] args) {
        computer c=new computer();
        TFCard tfCard=new TFimpl();

        SDCard sdCard=new TFAdapter2(tfCard);
        c.readSD(sdCard);
    }
}
