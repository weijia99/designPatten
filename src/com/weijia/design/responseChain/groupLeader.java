package com.weijia.design.responseChain;

public class groupLeader extends handle{
    public groupLeader() {
        super(NUM_ONE,NUM_THREE);
    }

    @Override
    public void handleLeave(leaveRequest leaveRequest) {
        System.out.println("小组长同意");
    }
}
