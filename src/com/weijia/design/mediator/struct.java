package com.weijia.design.mediator;

public class struct extends mediator{
    private owner owner;
    private tenant tenant;

    public com.weijia.design.mediator.owner getOwner() {
        return owner;
    }

    public void setOwner(com.weijia.design.mediator.owner owner) {
        this.owner = owner;
    }

    public com.weijia.design.mediator.tenant getTenant() {
        return tenant;
    }

    public void setTenant(com.weijia.design.mediator.tenant tenant) {
        this.tenant = tenant;
    }



    @Override
    public void contact(String msg, person person) {
        if (person==owner){
            owner.getMsg(msg);
        }else {
            tenant.getMsg(msg);
        }
    }
}
