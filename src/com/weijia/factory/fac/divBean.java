package com.weijia.factory.fac;

import com.weijia.factory.bean;

public class divBean extends bean {
    @Override
    public double getResult() {
      if(getNumble_b()==0.0d){
          throw new ArithmeticException();
      }
        return getNumble_a()/getNumble_b();
    }
}
