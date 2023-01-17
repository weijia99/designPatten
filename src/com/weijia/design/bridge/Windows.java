package com.weijia.design.bridge;

public class Windows extends os{
    public Windows(videoFile vf) {
        super(vf);
    }

    @Override
    public void play(String name) {
        System.out.println("windows has decoded");
        vf.decode(name);
    }
}
