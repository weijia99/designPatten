package com.weijia.design.adapter;

public class TFimpl implements TFCard{
    @Override
    public void readTF(String s) {
        System.out.println(s+" has been read by TFCard");
    }

    @Override
    public void writeTF(String s) {
        System.out.println(s+" has been written by TFCard");

    }
}
