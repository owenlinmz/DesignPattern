package com.owen.principle.singleresponsibility;

public class Programmer implements IStaff {
    private final String name;

    public Programmer(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "在编写代码。");
    }
}

