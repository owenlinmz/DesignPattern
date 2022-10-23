package com.owen.principle.singleton;

public class ChocolateBoiler {

    private boolean empty;

    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
}
