package com.weijia.design.decorate;

public class fireNoodle extends fastFood{
    public fireNoodle() {
        super(12,"fireNoodle");
    }

    @Override
    public float getCost() {
        return getPrice();
    }
}
