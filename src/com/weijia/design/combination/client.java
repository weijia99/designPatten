package com.weijia.design.combination;

public class client {
    public static void main(String[] args) {
        MenuComponent p1=new Menu("menu 1",1);
        p1.add(new MenuItem("test11",2));
        p1.add(new MenuItem("test12",2));
        p1.add(new MenuItem("test13",2));

        MenuComponent p2=new Menu("menu 2",1);
        p2.add(new MenuItem("test21",2));
        p2.add(new MenuItem("test22",2));
        p2.add(new MenuItem("test23",2));

        MenuComponent p3=new Menu("menu 3",1);
        p3.add(new MenuItem("test31",2));
        p3.add(new MenuItem("test32",2));
        p3.add(new MenuItem("test33",2));

        MenuComponent p=new Menu("menu",0);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.print();
    }

}
