package com.weijia.design.responseChain;

public class manager extends handle{
    public manager() {
        super(NUM_THREE,NUM_SEVEN);
    }

    @Override
    public void handleLeave(leaveRequest leaveRequest) {
        System.out.println("经理同意");
    }
}
