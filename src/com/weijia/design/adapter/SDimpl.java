package com.weijia.design.adapter;

public class SDimpl implements SDCard{
    @Override
    public void readSD(String s) {
        System.out.println(s+"has been read");
    }

    @Override
    public void writeSD(String s) {
        System.out.println(s+"has been written");
    }
}
