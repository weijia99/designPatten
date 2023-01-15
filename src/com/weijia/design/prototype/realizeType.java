package com.weijia.design.prototype;

public class realizeType implements Cloneable{
    public realizeType() {
        System.out.println("原型构建完成");

    }

    @Override
    protected realizeType clone() throws CloneNotSupportedException {
        System.out.println("克隆完成");
//        直接返回克隆对象,返回对象
        return (realizeType) super.clone();
    }
}
