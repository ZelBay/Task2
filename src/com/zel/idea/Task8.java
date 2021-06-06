package com.zel.idea;

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое положительное число");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Сумма нечетных чисел равна: " + sum);
    }
}
