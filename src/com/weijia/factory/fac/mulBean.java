package com.weijia.factory.fac;

import com.weijia.factory.bean;

public class mulBean extends bean {
    @Override
    public double getResult() {
        return getNumble_a()*getNumble_b();
    }
}
