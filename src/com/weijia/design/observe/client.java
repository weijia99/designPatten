package com.weijia.design.observe;

//�᳹��ģʽ��Ҫ��
//�������Լ�����û�,Ȼ��Ҫ������Ϣ��ʱ��,��������Ϣ���û�
//�����û����·���
public class client {
    public static void main(String[] args) {
        wechar w1=new wechar("xiaoming");
        wechar w2=new wechar("xiaohua");
        wechar w3=new wechar("xiaochen");

        subscription s=new subscription();
        s.attach(w1);
        s.attach(w2);
        s.attach(w3);

        s.notify("������Ƶ��");

    }
}
