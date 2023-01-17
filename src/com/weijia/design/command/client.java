package com.weijia.design.command;

//订单命令主要是把订单给厨师,让厨师处理订单内容
//命令主要是让厨师坐任务
//服务员主要是收到命令,然后运行命令
//一个手机命令.命令然后进行下达给别人
public class client {
    public static void main(String[] args) {
        order order1=new order();
        order1.setTable(1);
        order1.getFoodDic().put("西红柿",1);
        order1.getFoodDic().put("茄子",2);

        order order2=new order();
        order2.setTable(2);
        order2.getFoodDic().put("西红柿鸡蛋",3);
        order2.getFoodDic().put("茄子炒肉",2);

        chef chef=new chef();

        orderCommand cmd1=new orderCommand(chef,order1);
        orderCommand cmd2=new orderCommand(chef,order2);

        waiter waiter=new waiter();
        waiter.setCommand(cmd1);
        waiter.setCommand(cmd2);
        //加入到所有的订单列表,然后运行
        waiter.orderUp();

    }
}
