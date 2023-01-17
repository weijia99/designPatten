package com.weijia.design.bridge;

public class AVIFile implements videoFile{
    @Override
    public void decode(String name) {
        System.out.println("AVI has been decoded +"+name);
    }
}
