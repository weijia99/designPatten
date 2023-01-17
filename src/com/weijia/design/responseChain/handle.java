package com.weijia.design.responseChain;

public abstract class handle {
    protected final static int NUM_ONE=1;
    protected final static int NUM_THREE=3;
    protected final static int NUM_SEVEN=7;
    private int numStart;
    private int numEnd;

    private handle next;
    //链表使用

    public handle(handle next) {
        this.next = next;
    }

    public handle(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public handle(int numStart) {
        this.numStart = numStart;
    }

    public void setNext(handle next) {
        this.next = next;
    }
    public final void submit(leaveRequest leaveRequest){
//        首先第一步就是进行初级领导检查
        if (leaveRequest.getDays()>=this.numStart){
            this.handleLeave(leaveRequest);
            if (null!=this.next&&leaveRequest.getDays()>numEnd){
                this.next.submit(leaveRequest);
            }
        }else {
            System.out.println("结束");
        }
    }
    public abstract void handleLeave(leaveRequest leaveRequest);

}
