package com.owen.principle.abstractfactory;

import com.owen.principle.abstractfactory.chair.Chair;
import com.owen.principle.abstractfactory.factory.AbstractFactory;
import com.owen.principle.abstractfactory.factory.ChinaFactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory = new ChinaFactory();

        Chair chair = factory.createChair();

        chair.get();
    }
}
