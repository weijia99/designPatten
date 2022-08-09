package com.weijia.factory;
//使用工程模式构建，需要把工厂变成静态类

public class client {
    public static void main(String[] args) {

        bean bean1 = BeanFactory.create("+");
        bean1.setNumble_a(3.3);
        bean1.setNumble_b(2.0);
        System.out.println(bean1.getResult());
    }
}
