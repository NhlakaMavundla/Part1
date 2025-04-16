/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part_1_test;

/**
 *
 * @author lab_services_student
 */

import java.util.Scanner;
public class Part_1_test {
    
    // Method to check if the username is valid
    public static boolean checkUserName(String username) {
        // Username must contain an underscore and be no more than 5 characters long
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check if the password is valid
    public static boolean checkPasswordComplexity(String password) {
        // Password must be at least 8 characters long, contain a capital letter, a number, and a special character
        String passwordPattern = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        return password.matches(passwordPattern);
    }

    // Method to check if the cell phone number is valid
    public static boolean checkCellPhoneNumber(String cellPhoneNumber) {
        // Cell phone number must contain the international country code and be no more than 10 characters long
        String phonePattern = "^\\+27\\d{9}$";
        return cellPhoneNumber.matches(phonePattern);
    }

    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

      // Capture user's first and last name
        System.out.println("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scanner.nextLine();

        // User registration
        String username;
        while (true) {
            System.out.println("Enter username:");
            username = scanner.nextLine();
            if (checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        }

        String password;
        while (true) {
            System.out.println("Enter password:");
            password = scanner.nextLine();
            if (checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }
        }

        String cellPhoneNumber;
        while (true) {
            System.out.println("Enter South African cell phone number:");
            cellPhoneNumber = scanner.nextLine();
            if (checkCellPhoneNumber(cellPhoneNumber)) {
                System.out.println("Cell phone number successfully added.");
                break;
            } else {
                System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
            }
        }

        // User login
        while (true) {
            System.out.println("Enter username to login:");
            String loginUsername = scanner.nextLine();
            System.out.println("Enter password to login:");
            String loginPassword = scanner.nextLine();

            if (loginUsername.equals(username) && loginPassword.equals(password)) {
                System.out.println("Welcome " + firstName + " " + lastName + ", it is great to see you again.");
                break;
            } else {
                System.out.println("Username or password incorrect, please try again.");
            }
        }

        scanner.close();
    }
}
