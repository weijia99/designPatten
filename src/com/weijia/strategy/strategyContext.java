package com.weijia.strategy;

import com.weijia.strategy.bean.strategy;
import com.weijia.strategy.bean.strategyA;
import com.weijia.strategy.bean.strategyB;
import com.weijia.strategy.bean.strategyC;

//这个给是使用一个进行构建
public class strategyContext {
    private strategy s;
//    自己传入合适的context
    public strategyContext(String name) {
        switch (name){
            case "norm":
                s=new strategyA();
                break;
            case "discount":
                s=new strategyB(0.8);
                break;
            case "refund":
                s=new strategyC();
                break;
        }
    }

    public double getMoney(double money){
        return s.getAlgo(money);
    }
}
