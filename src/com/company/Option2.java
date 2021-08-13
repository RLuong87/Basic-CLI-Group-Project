package com.company;

public class Option2 {

    public static void reverseStr() {

        System.out.println("Enter a string for reversal");
        String option = Main.scanner.nextLine();
        String newOption = "";

        for (int i = option.length() - 1; i >= 0 ; i--) {
            newOption += option.charAt(i);
        }
        System.out.println(newOption);
    }
}
