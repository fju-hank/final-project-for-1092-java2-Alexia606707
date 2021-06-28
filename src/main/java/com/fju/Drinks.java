package com.fju;

public class Drinks extends Menu{
    public Drinks() {
        id = "c";
    }

    @Override
    public String getName() {
        return "Drinks";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
