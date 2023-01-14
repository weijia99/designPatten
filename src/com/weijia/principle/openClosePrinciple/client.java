package com.weijia.principle.openClosePrinciple;

public class client {


    public static void main(String[] args) {
         abstractSkin skin =new defaultSkin();
         sougouInput s=new sougouInput(skin);
         s.show();
    }
}
