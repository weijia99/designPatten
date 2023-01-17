package com.weijia.design.bridge;

//桥接模式是为了,减少类
//李如四边形,子类长方形,正方形,有颜色,那就是4个子类
//但是桥接模式,只需要两个类,颜色是第三类,插入到长方形,正方形
public class client {
    public static void main(String[] args) {
        videoFile name=new RMVBFile();
        os mac=new Windows(name);
        mac.play("test.rmvb");
    }
}
