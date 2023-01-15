package com.weijia.design.decorate;

public abstract class fastFood {
    private float price;
    private String name;

    public fastFood(float price, String name) {
        this.price = price;
        this.name = name;
    }

    public fastFood() {
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract float getCost();
}
