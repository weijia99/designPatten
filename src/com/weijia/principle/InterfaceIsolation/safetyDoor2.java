package com.weijia.principle.InterfaceIsolation;

public class safetyDoor2 implements antiFireDoor{
    @Override
    public void antiFire() {
        System.out.println("this door can antiFire");

    }
}
