package com.weijia.design.adapter;
//使用聚合模式,这个是通过传递
public class TFAdapter2 implements SDCard{
    private TFCard Tf;

    public TFAdapter2(TFCard tf) {
        Tf = tf;
    }


    @Override
    public void readSD(String s) {
        System.out.println("adapter2 has opened");
        Tf.readTF(s);
    }

    @Override
    public void writeSD(String s) {

    }
}
