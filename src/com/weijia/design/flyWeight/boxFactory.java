package com.weijia.design.flyWeight;

import java.util.HashMap;

public class boxFactory {
    private static HashMap<String,abstractBox> map;
    private boxFactory(){
        map=new HashMap<>();
        abstractBox i=new IBox();
        abstractBox l =new LBox();
        map.put("i",i);
        map.put("l",l);

    }
    public static class singletonHolder{
        public static final boxFactory Instance =new boxFactory();
    }
    public abstractBox getBox(String i){
        return map.get(i);
    }
}
