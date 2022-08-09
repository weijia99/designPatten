package com.weijia.factory.fac;

import com.weijia.factory.bean;

public class subBean extends bean {
    @Override
    public double getResult() {
        return getNumble_a()-getNumble_b();
    }
}
