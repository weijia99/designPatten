package com.weijia.decorate.bean;

public class clothes extends person{
//    װ����һ��ģ��
    protected person p;

    public void Decorate(person p){
        this.p=p;
    }
//    ������������дshow

    @Override
    public void show() {
        if(null!=p){
            p.show();
        }
    }
}
