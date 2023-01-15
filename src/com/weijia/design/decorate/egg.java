package com.weijia.design.decorate;

public class egg extends Garnish{
    public egg(fastFood food){
        super(food,1,"egg");
    }
    public float getCost(){
        return getPrice()+getFood().getCost();
    }

    @Override
    public String getName() {
        return super.getName()+getFood().getName();
    }
}
