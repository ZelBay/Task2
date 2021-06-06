package com.zel.idea;

import java.util.Scanner;

public class Task7 {
    public static void main (String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int elem: arr) {
            if (elem == x || elem == y || elem == z) {
                System.out.println("Данное значение " + elem + " имеется в константах");
            }
        }
    }
}
