package com.weijia.design.command;

import java.util.Set;

public class orderCommand implements command{
    private chef chef;
    private order order;

    public orderCommand(com.weijia.design.command.chef chef, com.weijia.design.command.order order) {
        this.chef = chef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getTable()+"×¿µÄ¶©µ¥");
        Set<String> keySet = order.getFoodDic().keySet();
        for (String key:keySet){
            chef.makeFood(key,order.getFoodDic().get(key));
        }
        System.out.println("cooking finish");
    }

}
