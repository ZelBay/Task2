package com.zel.idea;

import java.util.Scanner;

public class Task10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double[][] arr = new double[a][b];
        System.out.println("Введите значения матрицы: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < arr[0].length; j++) {
            arr[0][j] = arr[0][j] * 3;
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();
    }

}
