package com.main;

import java.io.File;
import java.io.IOException;
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
        File dir = new File(ROOT_DIR);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                System.out.println("No root directory detected, created new ROOT_DIR");
            }
        }
    }

    private static void printWelcomeScreen() {
        System.out.println("Welcome to LockedMe.com");
    }

    private static void mainMenuLoop() {
        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Display files in ascending order");
            System.out.println("2. Add a file");
            System.out.println("3. Delete a file");
            System.out.println("4. Search for a file");
            System.out.println("5. Exit application");
            System.out.print("Enter your choice (1-5): ");

            String input = sc.nextLine().trim();

            switch (input) {
                case "1":
                    displayFiles();
                    break;
                case "2":
                    addFile();
                    break;
                case "3":
//                    deleteFile();
                    break;
                case "4":
//                    searchFile();
                    break;
                case "5":
                    System.out.println("Thank you for using LockedMe.com. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
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

    private static void addFile() {
        System.out.print("Enter the file name to add: ");
        String fileName = sc.nextLine().trim();
        File file = new File(ROOT_DIR + "\\" + fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
