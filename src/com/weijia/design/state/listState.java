package com.weijia.design.state;

public abstract class listState {
    protected context context;

    public void setContext(com.weijia.design.state.context context) {
        this.context = context;
    }
    public abstract void open();
    public abstract void close();
    public abstract void run();
    public abstract void stop();

}
