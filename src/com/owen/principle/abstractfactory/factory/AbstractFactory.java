package com.owen.principle.abstractfactory.factory;

import com.owen.principle.abstractfactory.chair.Chair;
import com.owen.principle.abstractfactory.desk.Desk;

public abstract class AbstractFactory {

    abstract public Chair createChair();

    abstract public Desk createDesk();


}
