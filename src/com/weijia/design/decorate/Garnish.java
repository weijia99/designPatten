package com.weijia.design.decorate;


//配料也是快餐,但是抽象类
public abstract class Garnish extends fastFood{
//    也是要继承,使用聚合模式
    private fastFood food;

    public fastFood getFood() {
        return food;
    }

    public void setFood(fastFood food) {
        this.food = food;
    }
    public Garnish(fastFood food,float price,String name){
        super(price,name);
        this.food=food;
    }
}
