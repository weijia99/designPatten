package com.weijia.decorate.bean;

public class Tshirt extends clothes{




    @Override
    public void show() {
        System.out.println("wear shirt");
//        ʹ��p��show
        this.p.show();
    }
}
