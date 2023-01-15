package com.weijia.design.adapter;

public class TFAdapter extends TFimpl implements SDCard {
    @Override
    public void readSD(String s) {
//        直接调用那个TF的数据,然后出入到sd
        System.out.println("Adapter has opened");
        readTF(s);
    }

    @Override
    public void writeSD(String s) {
        System.out.println("Adapter has opened");
        writeTF(s);
    }
}
