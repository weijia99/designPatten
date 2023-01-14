package com.weijia.principle.openClosePrinciple;

public class sougouInput {
    private abstractSkin skin;

//    use construct to add skin
    public sougouInput(abstractSkin skin) {
        this.skin = skin;
    }

    public void show(){
        skin.show();
    }
}
