package com.weijia.design.builder.update;

public class client {
    public static void main(String[] args) {
//        首先创建 的是builder,然后通过builder进行创建phone
        phone phone=new phone.builder()
                .cpu("intel")
                .memory("samsung")
                .screen("jdi")
                .motherBoard("huawei")
                .build();
        System.out.println(phone.toString());

    }

}
