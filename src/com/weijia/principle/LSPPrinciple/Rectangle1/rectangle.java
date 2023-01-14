package com.weijia.principle.LSPPrinciple.Rectangle1;

public class rectangle {
//    this demo is used to show that
//    you can extend your father's all functions
//    however if you don't need all functions
//    you shouldn't extend all function
//    子类不重写父类的方法，否则会有问题
    private double width;
    private double height;

    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
