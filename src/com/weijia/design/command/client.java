package com.weijia.design.command;

//����������Ҫ�ǰѶ�������ʦ,�ó�ʦ����������
//������Ҫ���ó�ʦ������
//����Ա��Ҫ���յ�����,Ȼ����������
//һ���ֻ�����.����Ȼ������´������
public class client {
    public static void main(String[] args) {
        order order1=new order();
        order1.setTable(1);
        order1.getFoodDic().put("������",1);
        order1.getFoodDic().put("����",2);

        order order2=new order();
        order2.setTable(2);
        order2.getFoodDic().put("����������",3);
        order2.getFoodDic().put("���ӳ���",2);

        chef chef=new chef();

        orderCommand cmd1=new orderCommand(chef,order1);
        orderCommand cmd2=new orderCommand(chef,order2);

        waiter waiter=new waiter();
        waiter.setCommand(cmd1);
        waiter.setCommand(cmd2);
        //���뵽���еĶ����б�,Ȼ������
        waiter.orderUp();

    }
}
