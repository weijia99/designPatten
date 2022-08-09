package com.weijia.factory.fac;

import com.weijia.factory.bean;

public class addBean extends bean {
    @Override
    public double getResult() {
        double res=0;
        res=getNumble_a()+getNumble_b();
        return res;
    }
}
