package com.weijia.design.prototype;

public class realizeType implements Cloneable{
    public realizeType() {
        System.out.println("ԭ�͹������");

    }

    @Override
    protected realizeType clone() throws CloneNotSupportedException {
        System.out.println("��¡���");
//        ֱ�ӷ��ؿ�¡����,���ض���
        return (realizeType) super.clone();
    }
}
