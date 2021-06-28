package com.fju;

public abstract class Menu {
    String id;

    public boolean validate(String meal) {
        return meal.equals(id);
    }

    public abstract String getName();
    public abstract int getPrice();
}
