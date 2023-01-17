package com.weijia.design.bridge;

public class Mac extends os{


    public Mac(videoFile vf) {
        super(vf);
    }

    @Override
    public void play(String name) {
        System.out.println("mac decoding");
        vf.decode(name);
    }
}
