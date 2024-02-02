package org.example;

public class Contructs {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }


        //please give me if else statement example with double values
        double num1 = 10.5, num2 = 5.5, num3 = 15.5;
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest number.");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest number.");
        else if (num3 >= num1 && num3 >= num2)
            System.out.println(num3 + " is the largest number.");
        else
            System.out.println(num3 + " is the largest number.");


        //please give me switch statement example
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("WednesDay");
                break;
            case 4:
                System.out.println("ThursDay");
                break;
            case 5:
                System.out.println("FriDay");
                break;
            case 6:
                System.out.println("SaturDay");
                break;
            case 7:
                System.out.println("SunDay");
                break;
            default:
                System.out.println("Invalid Day");
        }


        //example2 for if statement
        int x = 30;
        int y = 10;
        if (x == 30) {
            if (y == 10) {
                System.out.println("X = 30 and Y = 10");
            }
        }

        //example3
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }



    }
}
