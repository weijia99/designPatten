package com.weijia.principle.LSPPrinciple.Rectangle1;

public class square extends rectangle{
    private double width;
    private double height;
    public square(double width, double height) {
        super(width, height);
    }

    @Override
    public void setWidth(double width) {
//        super.setWidth(width);
//        重新使用这个
        super.setWidth(width);
        super.setHeight(width);
    }
}
