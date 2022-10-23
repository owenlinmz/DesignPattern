package com.owen.principle.abstractfactory.chair;

public class ChinaChair implements Chair {
    @Override
    public ChinaChair get() {
        System.out.println("You got a china chair");
        return this;
    }
}
