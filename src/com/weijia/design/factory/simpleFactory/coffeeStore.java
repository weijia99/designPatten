package com.weijia.design.factory.simpleFactory;

import java.util.Objects;

public class coffeeStore {
    public static void main(String[] args) {
        coffee coffee = getCoffee("l");
        coffee.getName();
    }
    public static coffee getCoffee(String name){
        coffee c;
        if(Objects.equals(name, "a")){
            c =new american();
        }else if(Objects.equals(name, "l")){
            c=new latte();

        }else{
            c=null;
        }
        return c;
    }
}
