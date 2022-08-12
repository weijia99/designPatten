package com.weijia.decorate;

import com.weijia.decorate.bean.Tshirt;
import com.weijia.decorate.bean.person;
import com.weijia.decorate.bean.shoes;

public class client {
    public static void main(String[] args) {
        person p =new person("ming");
//        接下来就是放入到衣服里面
        Tshirt ts =new Tshirt();
        shoes s =new shoes();
        ts.Decorate(p);
        s.Decorate(ts);
        s.show();
    }
}
