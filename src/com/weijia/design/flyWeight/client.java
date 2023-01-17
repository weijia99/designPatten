package com.weijia.design.flyWeight;

public class client {
    public static void main(String[] args) {
        boxFactory instance = boxFactory.singletonHolder.Instance;
        abstractBox i = instance.getBox("i");
        abstractBox l = instance.getBox("l");
        i.display("yellow");


    }
}
