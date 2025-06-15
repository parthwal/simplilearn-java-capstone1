package com.main;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class LockedMe {

    static final String AppName = "LockedMeFiles";
    static final String ROOT_DIR = "Root";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	initRootDir();
        printWelcomeScreen();
        mainMenuLoop();
        sc.close();
    }

    private static void initRootDir() {
    	File dir=new File(ROOT_DIR);
    	if(!dir.exists()) {
    		if(dir.mkdir()) {
    			System.out.println("No root directory detected, created new ROOT_DIR");
    		};
    	}
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
                    displayFiles();
                    break;
                case "2":
                    businessOperations();
                    break;
                case "3":
                    System.out.println("Thank you for using LockedMe.com. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
    private static void displayFiles() {
        File dir = new File(ROOT_DIR);
        String[] fileList = dir.list();

        if (fileList == null || fileList.length == 0) {
            System.out.println("The directory is currently empty.");
        } else {
            Arrays.sort(fileList);
            System.out.println("Files in the directory (ascending order):");
            for (String file : fileList) {
                System.out.println("- " + file);
            }
        }
    }
    private static void businessOperations() {
        while (true) {
            System.out.println("\nBusiness Operations:");
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search for a file");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter your choice (1-4): ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
//                    addFile();
                	System.out.println("TODO");
                    break;
                case "2":
//                    deleteFile();
                	System.out.println("TODO");
                    break;
                case "3":
//                    searchFile();
                	System.out.println("TODO");
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

}