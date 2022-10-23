package com.owen.principle.abstractfactory.factory;

import com.owen.principle.abstractfactory.chair.Chair;
import com.owen.principle.abstractfactory.chair.ChinaChair;
import com.owen.principle.abstractfactory.desk.ChinaDesk;
import com.owen.principle.abstractfactory.desk.Desk;

public class ChinaFactory extends AbstractFactory {
    @Override
    public Chair createChair() {
        System.out.println("create a china chair");
        return new ChinaChair();
    }

    @Override
    public Desk createDesk() {
        System.out.println("create a china desk");
        return new ChinaDesk();
    }
}
