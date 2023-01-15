package com.weijia.design.builder.update;

//这个例子是演示多个参数为,链式反应,一个个进行添加
public class phone {
    private String memory;
    private String cpu;
    private String screen;
    private String motherBoard;

//    私有构造函数
    private phone(builder builder){
        cpu=builder.cpu;
        memory=builder.memory;
        screen=builder.screen;
        motherBoard=builder.motherBoard;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }

    public static final class builder {
//        使用内部类,来进行创建builder,直接进行点cpu
        private String memory;
        private String cpu;
        private String screen;
        private String motherBoard;
        public builder(){}

        public builder cpu(String val){
            cpu=val;
            return this;
        }
        public builder memory(String val){
            memory=val;
            return this;
        }
        public builder screen(String val){
            screen=val;
            return this;
        }
        public builder motherBoard(String val){
            motherBoard=val;
            return this;
        }
        public phone build(){
            return new phone(this);
        }
    }
}
