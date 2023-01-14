package com.weijia.principle.LSPPrinciple.Rectangle2;

public class square implements quadr{
    private double side;

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getHeight() {
        return side;
    }

    public void setWidth(double side) {
        this.side = side;
    }
    public void setHeight(double side) {
        this.side = side;
    }
}
