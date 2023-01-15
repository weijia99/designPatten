package com.weijia.design.prototype;

public class citation implements Cloneable {
    private student student;

    public citation(student student) {
        this.student = student;
    }

    public student getStudent() {
        return student;
    }

    public void setStudent(student student) {
        this.student = student;
    }

    @Override
    protected citation clone() throws CloneNotSupportedException {
        return (citation) super.clone();
    }
    public void show(){
        System.out.println(student.getName()+"¹§Ï²Äã");
    }
}
