package com.weijia.design.responseChain;

public class client {
    public static void main(String[] args) {
        leaveRequest leaveRequest=new leaveRequest("xiaoming",5);
        groupLeader g=new groupLeader();
        manager m=new manager();
        g.setNext(m);
        g.submit(leaveRequest);
    }
}
