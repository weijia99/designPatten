package com.weijia.decorate;

import com.weijia.decorate.bean.Tshirt;
import com.weijia.decorate.bean.person;
import com.weijia.decorate.bean.shoes;

public class client {
    public static void main(String[] args) {
        person p =new person("ming");
//        ���������Ƿ��뵽�·�����
        Tshirt ts =new Tshirt();
        shoes s =new shoes();
        ts.Decorate(p);
        s.Decorate(ts);
        s.show();
    }
}
