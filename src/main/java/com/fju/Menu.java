package com.fju;

public abstract class Menu {
    int id;

    public boolean validate(int meal) {
        return meal == id;
    }

    public abstract String getName();
    public abstract int getPrice();
}
