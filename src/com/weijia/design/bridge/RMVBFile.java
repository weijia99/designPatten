package com.weijia.design.bridge;

public class RMVBFile implements videoFile{
    @Override
    public void decode(String name) {
        System.out.println("RMVB has decoded "+name);
    }
}
