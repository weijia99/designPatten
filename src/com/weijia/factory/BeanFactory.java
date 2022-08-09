package com.weijia.factory;

import com.weijia.factory.fac.addBean;
import com.weijia.factory.fac.divBean;
import com.weijia.factory.fac.mulBean;
import com.weijia.factory.fac.subBean;
//使用工程模式构建，需要把工厂变成静态类
public class BeanFactory {
    public static bean create(String op){
        bean bean1=null;
        switch (op){
            case "+":
                bean1=new addBean();
                break;
            case "-":
                bean1=new subBean();
                break;
            case "*":
                bean1=new mulBean();
                break;
            case "/":
                bean1=new divBean();
                break;
        }
        return bean1;
    }
}
