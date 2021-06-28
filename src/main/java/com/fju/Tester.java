package com.fju;

public class Tester {
    public static void main(String[] args) {
        MenuDemo menuDemo = new MenuDemo();
        Menu[] menus = {
                new Hamburger(),
                new FrenchFries(),
                new Drinks(),
                new IceCream()
        };

        System.out.println("Menu: ");
        for (Menu menu: menus) {
            System.out.println(menu.id + ")\t" + menu.getName() + "\t$" + menu.getPrice());
        }

    }
}
