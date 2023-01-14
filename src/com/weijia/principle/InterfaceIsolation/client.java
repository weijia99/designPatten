package com.weijia.principle.InterfaceIsolation;

public class client {
    public static void main(String[] args) {
        safetyDoor1 s1=new safetyDoor1();
        s1.antiFire();
        s1.antiTheft();
        System.out.println("===========");

        safetyDoor2 s2=new safetyDoor2();
        s2.antiFire();
    }
}
