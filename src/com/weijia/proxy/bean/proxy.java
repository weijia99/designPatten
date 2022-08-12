package com.weijia.proxy.bean;

public class proxy implements GiveGift{
    pursuit p;
    public proxy(schoolGirl schoolGirl){
//        需要我自己把追求对象传入
//        也是传入目标对象
        p=new pursuit(schoolGirl);
    }
    @Override
    public void giveDollar() {
        p.giveDollar();
    }

    @Override
    public void giveFlower() {
    p.giveFlower();
    }
}
