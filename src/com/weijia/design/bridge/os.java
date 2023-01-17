package com.weijia.design.bridge;

public abstract class os {
    protected videoFile vf;

    public os(videoFile vf) {
        this.vf = vf;
    }


    public abstract void play(String name);
}
