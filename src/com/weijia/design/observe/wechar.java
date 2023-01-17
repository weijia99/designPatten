package com.weijia.design.observe;

public class wechar implements observer{
    private String name;

    public wechar(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+"-"+msg);
    }
}
