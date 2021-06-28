package com.fju;

import java.util.Scanner;

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

        int n;
        int sum = 0;
        do {
            System.out.println("Please enter the meals: ");
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();



            n = Integer.parseInt(s);
            System.out.println("Total: " + sum);
        } while (n != 0);
    }
}
