package com.weijia.design.observe;

//贯彻着模式主要是
//公主号自己添加用户,然后要推送信息的时候,把所有信息给用户
//调用用户更新方法
public class client {
    public static void main(String[] args) {
        wechar w1=new wechar("xiaoming");
        wechar w2=new wechar("xiaohua");
        wechar w3=new wechar("xiaochen");

        subscription s=new subscription();
        s.attach(w1);
        s.attach(w2);
        s.attach(w3);

        s.notify("更新视频了");

    }
}
