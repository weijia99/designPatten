package com.weijia.design.command;

import java.util.HashMap;
import java.util.Map;

//主要是为了,记录那个菜有几分
public class order {
    private int table;
    //订餐号
    private Map<String,Integer> foodDic=new HashMap<>();

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    public Map<String, Integer> getFoodDic() {
        return foodDic;
    }

    public void setFoodDic(String name,int num) {
        foodDic.put(name,num);
    }
}
