package com.weijia.proxy;

import com.weijia.proxy.bean.proxy;
import com.weijia.proxy.bean.pursuit;
import com.weijia.proxy.bean.schoolGirl;

public class client {
    public static void main(String[] args) {
        schoolGirl s=new schoolGirl("liMing ");
        proxy p =new proxy(s);
        p.giveDollar();
        p.giveFlower();
    }
}
