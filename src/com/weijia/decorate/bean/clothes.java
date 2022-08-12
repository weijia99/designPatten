package com.weijia.decorate.bean;

public class clothes extends person{
//    装饰上一个模块
    protected person p;

    public void Decorate(person p){
        this.p=p;
    }
//    接下来就是重写show

    @Override
    public void show() {
        if(null!=p){
            p.show();
        }
    }
}
