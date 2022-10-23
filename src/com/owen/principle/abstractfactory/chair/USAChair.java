package com.owen.principle.abstractfactory.chair;

public class USAChair implements Chair {
    @Override
    public USAChair get() {
        System.out.println("You got a usa chair");
        return this;
    }
}
