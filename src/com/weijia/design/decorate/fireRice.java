package com.weijia.design.decorate;

public class fireRice extends fastFood{

    public fireRice(){
        super(10,"rice");
    }
    @Override
    public float getCost() {
        return getPrice();
    }
}
