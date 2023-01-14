package com.weijia.principle.LSPPrinciple.Rectangle2;

public class rectangle implements quadr{
    private double height;
    private double width;
    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
