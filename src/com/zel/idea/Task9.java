package com.zel.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrLength = scanner.nextInt();
        double[] arr = new double[arrLength];
        double sum = 0;
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextDouble();
            sum += arr[i];
        }
        double avg = sum / arrLength;
        for (int i = 0; i < arrLength; i++) {
            arr[i] *= avg;
        }
        String doubleArrString = Arrays.toString(arr);
        System.out.println(doubleArrString);
    }
}
