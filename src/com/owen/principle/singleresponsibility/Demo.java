package com.owen.principle.singleresponsibility;

public class Demo {
    public static void main(String[] args) {
        Staff personA = new Staff("程序员");
        personA.coding();

        Staff personB = new Staff("厨师");
        personB.cooking();

        Staff personC = new Staff("警察");
        personC.investigating();


        IStaff cook = new Cook("厨师");
        cook.work();

        IStaff police = new Police("警察");
        police.work();

        IStaff programmer = new Programmer("程序员");
        programmer.work();

        Sub s = new Sub();

    }
}


class Base {
    public Base() {
        this.method(100);
    }

    {
        System.out.println("base");
    }

    public static void method(int i) {
        System.out.println("base " + i);
    }
}

class Sub extends Base {
    Sub() {
        super.method(70);
    }

    {
        System.out.println("sub");
    }

    public static void method(int i) {
        System.out.println("sub " + i);
    }
}
