package com.weijia.design.decorate;

public class client {
    public static void main(String[] args) {
        fastFood food=new fireRice();
        System.out.println(food.getName()+" "+food.getCost());

        food=new egg(food);
        System.out.println(food.getName()+" "+food.getCost());

        food=new bacon(food);
        System.out.println(food.getName()+" "+food.getCost());

    }
}
