package com.company;

import java.util.Scanner;

/*
This will be a new InteliJ project and a new GItHub Repo.
Make sure everyone present in class is able to get their GitHub set up properly before starting.
Then set a 30 minute timer for everyone to work on the first section solo.

-- SOLO --

Spend the first 30 minutes trying to do the following solo

Create an application that can take a user's name as input from the terminal
Have the application display a message --> Hello <name>

If you are done before time is up you can look into solutions for the following steps

-- AS A CLASS --

As a class create a Menu system that
Also the user to choose a program options OR exit the program using a number menu

It should look something like this

-------------------------
Welcome to Gabe's CLI!

Please choose an option to continue
1) Say Hello
2) Reverse a string
3) Add two numbers
4) Exit the program

Selection:
---------------------------

The text cursor should blink next to "Selection: " and allow the user to type a number.
When they press enter the program should either accept their input and proceed with their selection
ie when they enter "3" the program will then prompt them to enter two numbers one at a time, then give them the sum, then return back to the first menu


If the user enters an invalid selection, the program should prompt the. user with "The is an invalid selection" and then give them the ability to try again
 */

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        displayMenu();
    }

    static void reverseStr() {

        String str = scanner.nextLine();

        String[] splitter = str.split("");

        String rev = "";

        for (int i = splitter.length - 1; i >= 0; i--) {
            rev += splitter[i];
        }
        System.out.println(rev);
    }

    static void repeatAString() {

        System.out.println("Enter a string to repeat");
        String str = scanner.next();
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        String rep = "";

        for (int i = 0; i < num; i++) {
            rep += str;
        }
        System.out.println(rep);
    }

    static void displayMenu() {

        System.out.println("Welcome to Richie's CLI");
        int option;

        do {
            scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Please choose an option to continue");
            System.out.println("==========================================");
            System.out.println("1. Say Hello");
            System.out.println("2. Reverse a string");
            System.out.println("3. Add two numbers");
            System.out.println("4. Repeat a string");
            System.out.println("5. Exit the program");
            System.out.println("==========================================");
            System.out.print("Selection: ");
            option = scanner.nextInt();
            System.out.println();

            switch (option) {

                case 1:
                    System.out.println("What is your name?");
                    String name = scanner.next();
                    System.out.println("Hello " + name);
                    System.out.println("==========================================");
                    break;

                case 2:
                    System.out.println("Enter a string to reverse");
                    scanner.nextLine();
                    reverseStr();
                    System.out.println("==========================================");
                    break;

                case 3:
                    System.out.println("Enter a number");
                    int num1 = scanner.nextInt();
                    System.out.println("Enter another number");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + (num1 + num2));
                    System.out.println("==========================================");
                    break;

                case 4:
                    repeatAString();
                    scanner.nextLine();
                    System.out.println("==========================================");
                    break;

                case 5:
                    System.out.println("******************************************");
                    break;

                default:
                    System.out.println("This is not a valid selection\nPlease, try again");
                    break;
            }
        } while (option != 5);

        System.out.println("Thank you for your participation");
        System.out.println("******************************************");
    }
}

