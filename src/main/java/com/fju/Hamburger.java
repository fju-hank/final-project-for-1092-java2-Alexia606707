package com.fju;

public class Hamburger extends Menu{
    public Hamburger() {
        id = 1;
    }

    @Override
    public String getName() {
        return "Hamburger";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
