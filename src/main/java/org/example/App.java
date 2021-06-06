/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String numberOne = numbers.nextLine();
        int a = Integer.parseInt(numberOne);
        System.out.print("What is the second number? ");
        String numberTwo = numbers.nextLine();
        int b = Integer.parseInt(numberTwo);
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " - " + b + " = " + d);
        System.out.println(a + " * " + b + " = " + e);
        System.out.println(a + " / " + b + " = " + f);
    }
}
