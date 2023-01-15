package com.weijia.design.decorate;

public class bacon extends Garnish{
    public bacon(fastFood food) {
        super(food, 2,"bacon");
    }

    @Override
    public float getCost() {
        return getPrice()+ getFood().getCost();
    }

    @Override
    public String getName() {
        return super.getName()+getFood().getName();
    }
}
