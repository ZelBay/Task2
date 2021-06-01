package com.zel.idea;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String ch = scanner.next();
        switch (ch) {
            case "+": System.out.println(a + b);
                break;
            case "-": System.out.println(a - b);
                break;
            case "*": System.out.println(a * b);
                break;
            case "/": System.out.println(a / b);
                break;
            default:  System.out.println("DEFAULT");

        }
    }
}
