package com.owen.principle.singleresponsibility;

public class Cook implements IStaff {
    private final String name;

    public Cook(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "在煮菜。");
    }
}
