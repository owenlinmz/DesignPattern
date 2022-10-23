package com.owen.principle.singleresponsibility;

/**
 * 打工人
 */
public class Staff {
    private final String name;

    public Staff(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(this.name + "在打工。");
    }

    public void coding() {
        System.out.println(this.name + "在编写代码。");
    }

    public void cooking() {
        System.out.println(this.name + "在做饭。");
    }

    public void investigating() {
        System.out.println(this.name + "调查案件。");
    }
}
