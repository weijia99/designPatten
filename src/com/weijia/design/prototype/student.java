package com.weijia.design.prototype;

public class student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
