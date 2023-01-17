package com.weijia.design.observe;

import java.util.ArrayList;
import java.util.List;

public class subscription implements subject {
private List<observer> list=new ArrayList<>();
    @Override
    public void attach(observer ob) {
        list.add(ob);
    }

    @Override
    public void detach(observer ob) {
        list.remove(ob);
    }

    @Override
    public void notify(String msg) {
        for (observer ob:
             list) {
            ob.update(msg);
        }
    }
}
