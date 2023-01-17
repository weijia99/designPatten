package com.weijia.design.command;

import java.util.ArrayList;

public class waiter {
//    可以有多个命令
    private ArrayList<command> list;
    public waiter(){
        list=new ArrayList<>();
    }
    public void setCommand(command command){
        list.add(command);
    }

    public void orderUp(){
        System.out.println("order coming,chef");
        for (int i = 0; i < list.size(); i++) {
            command command = list.get(i);
            if (command != null) {
                command.execute();
            }
        }
    }
}
