package com.company;

public class Option1 {

    public static void getName(String input) {

        System.out.println("You choose option 1! What is your name?");
        String name = Main.scanner.nextLine();

        System.out.println("Hello " + name + "!");

    }
}

