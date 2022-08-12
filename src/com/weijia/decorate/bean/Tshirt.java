package com.weijia.decorate.bean;

public class Tshirt extends clothes{




    @Override
    public void show() {
        System.out.println("wear shirt");
//        Ê¹ÓÃpµÄshow
        this.p.show();
    }
}
