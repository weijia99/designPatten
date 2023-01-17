package com.weijia.design.mediator;


//主要是首先创建中介
//通过构造模式,把中介放到租户与房东里面
//然后再次设置中介的owner和tenant
//之后直接调用这个方法中介的
public class client {
    public static void main(String[] args) {
        mediator ms =new struct();

        owner owner=new owner("zhangsan",ms);
        tenant tenant=new tenant("lisi",ms);



    }
}
