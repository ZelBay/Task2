package com.zel.idea;

import java.util.Scanner;

public class TaskF2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение");
        String str = scanner.nextLine();
        if (str.startsWith("x") & str.contains("+")) {
            int a = Character.getNumericValue(str.charAt(2));
            int b = Character.getNumericValue(str.charAt(4));
            System.out.println("x = " + (b - a));
        }
        if (str.startsWith("x") & str.contains("-")) {
            int a = Character.getNumericValue(str.charAt(2));
            int b = Character.getNumericValue(str.charAt(4));
            System.out.println("x = " + (b + a));
        }
        if (str.endsWith("x") & str.contains("-")) {
            int a = Character.getNumericValue(str.charAt(0));
            int b = Character.getNumericValue(str.charAt(2));
            System.out.println("x = " + (a - b));
        }
        if (str.endsWith("x") & str.contains("+")) {
            int a = Character.getNumericValue(str.charAt(0));
            int b = Character.getNumericValue(str.charAt(2));
            System.out.println("x = " + (a + b));
        }
        if (str.charAt(2) == 'x' & str.contains("+")) {
            int a = Character.getNumericValue(str.charAt(0));
            int b = Character.getNumericValue(str.charAt(4));
            System.out.println("x = " + (b - a));
        }
        if (str.charAt(2) == 'x' & str.contains("-")) {
            int a = Character.getNumericValue(str.charAt(0));
            int b = Character.getNumericValue(str.charAt(4));
            System.out.println("x = " + (b - a) * -1);
        }
    }
}
