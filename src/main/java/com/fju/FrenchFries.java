package com.fju;

public class FrenchFries extends Menu{
    public FrenchFries() {
        id = "b";
    }

    @Override
    public String getName() {
        return "FrenchFries";
    }

    @Override
    public int getPrice() {
        return 40;
    }
}
