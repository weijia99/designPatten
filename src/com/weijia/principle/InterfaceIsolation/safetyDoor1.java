package com.weijia.principle.InterfaceIsolation;

//if you don't need all methods
//you needn't extending class,you can  use interface
public class safetyDoor1 implements antiTheftDoor,antiFireDoor{
    @Override
    public void antiFire() {
        System.out.println("this door can antiFire");
    }

    @Override
    public void antiTheft() {
        System.out.println("this door can antiTheft");

    }
}
