package com.weijia.design.observe;

public interface subject {
    void attach(observer ob);
    //add user
    void detach(observer ob);

    void notify(String msg);
}
