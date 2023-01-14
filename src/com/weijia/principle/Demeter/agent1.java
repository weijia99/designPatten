package com.weijia.principle.Demeter;

public class agent1 {
    private fan f;
    private star s;

    public void setF(fan f) {
        this.f = f;
    }

    public void setS(star s) {
        this.s = s;
    }
    public void meeting(){
        System.out.println(f.getName()+"与"+s.getName()+"相见了");
    }
}
