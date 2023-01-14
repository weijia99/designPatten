package com.weijia.principle.LSPPrinciple.Rectangle2;


//after updating ,square is not suitable for this function
public class client {
    public static void main(String[] args) {
      rectangle r=new rectangle();
      r.setWidth(20);
      r.setHeight(10);
        while(r.getHeight()<=r.getWidth()){
            r.setWidth(r.getWidth()-1);
        }
        System.out.println(r.getHeight()+" "+r.getWidth());
    }
}
