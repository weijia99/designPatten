package com.weijia.design.builder;

/*
装饰者模式,就是构建一个新的指挥官来进行所有的装配操作
然后电脑分为华为还有联想,电脑的一般操作都是专内存条,装显卡,但是电脑要有专门的机箱才能使用
所以需要使用protect computer,然后在这上面一个个加东西,电脑是抽象类,有内存条
然后实现就有不同的装配方式
 */
public class client {
    public static void main(String[] args) {
        builder builder=new mobikeBuilder();
        director director=new director(builder);
        bike bike = director.construct();
        System.out.println(bike.getSeat());
        System.out.println(bike.getFrame());
    }
}
