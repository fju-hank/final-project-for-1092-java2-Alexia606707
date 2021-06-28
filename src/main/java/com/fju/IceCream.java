package com.fju;

public class IceCream extends Menu{
    public IceCream() {
        id = 4;
    }

    @Override
    public String getName() {
        return "IceCream";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
