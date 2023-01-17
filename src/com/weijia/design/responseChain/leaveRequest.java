package com.weijia.design.responseChain;

public class leaveRequest {
    private String name;
    private int days;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public leaveRequest(String name, int days) {
        this.name = name;
        this.days = days;
    }
}
