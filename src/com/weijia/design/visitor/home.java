package com.weijia.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class home {
    private List<animal> node =new ArrayList<>();

    public void action(peroson p){
        for (animal a :
                node) {
            a.accept(p);
        }


    }
    public void add(animal a){
        node.add(a);
    }
}
