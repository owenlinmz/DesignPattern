package com.owen.principle.abstractfactory.factory;

import com.owen.principle.abstractfactory.chair.Chair;
import com.owen.principle.abstractfactory.chair.USAChair;
import com.owen.principle.abstractfactory.desk.Desk;
import com.owen.principle.abstractfactory.desk.USADesk;

public class USAFactory extends AbstractFactory{
    @Override
    public Chair createChair() {
        System.out.println("create a usa chair");
        return new USAChair();
    }

    @Override
    public Desk createDesk() {
        System.out.println("create a usa desk");
        return new USADesk();
    }
}
