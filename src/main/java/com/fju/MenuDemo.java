package com.fju;

import javax.swing.*;

public class MenuDemo {
    private JPanel main;
    private JPanel Menu;
    private JTextPane menu;
    private JPanel Meals;
    private JTextField Hamburger;
    private JTextField FrenchFries;
    private JTextField Drinks;
    private JTextField IceCream;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new MenuDemo().main);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }
}
