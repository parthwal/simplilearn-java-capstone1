package com.main;

import java.util.Scanner;

public class LockedMe {

    static final String AppName = "LockedMeFiles";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        printWelcomeScreen();
        mainMenuLoop();
        sc.close();
    }

    private static void printWelcomeScreen() {
        System.out.println("Welcome to LockedMe.com");
    }

    private static void mainMenuLoop() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Display files in ascending order");
            System.out.println("2. Business operations");
            System.out.println("3. Exit application");
            System.out.print("Enter your choice (1-3): ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.println("TODO");
                    break;
                case "2":
                    System.out.println("TODO");
                    break;
                case "3":
                    System.out.println("Thank you for using LockedMe.com. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}