package com.zel.idea;

import java.util.Scanner;

public class TaskF1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        double dollarRate = scanner.nextDouble();
        System.out.println("Введите количество рублей: ");
        int rubleCount = scanner.nextInt();
        double result = rubleCount / dollarRate;
        System.out.printf("Итого: %.2f долларов", result);
    }

}
