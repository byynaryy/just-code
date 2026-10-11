package com.oomph;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        try {
            int number = scanner.nextInt();
            System.out.println("This is what you entered: "+ number);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
        scanner.close();*/
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter an integer: ");

            try {
                number = scanner.nextInt();
                System.out.println("This is what you entered: " + number);
                validInput = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.next(); // Discard the invalid input
            }
        }

        scanner.close();
    }
}