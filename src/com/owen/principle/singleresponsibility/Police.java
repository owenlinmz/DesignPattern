package com.owen.principle.singleresponsibility;

public class Police implements IStaff {
    private final String name;

    public Police(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "在调查案件。");
    }
}
