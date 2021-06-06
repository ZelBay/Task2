package com.zel.idea;

import java.util.Arrays;
import java.util.Random;

public class Task14 {
    public static void main (String[] args) {
        int[] arr = new int[15];
        int max = 20;
        int min = -20;
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff + 1);
            arr[i] += min;
        }
        String intArrString = Arrays.toString(arr);
        System.out.println("Сгенерированный массив " + intArrString);
        int minElem = arr[0];
        int maxElem = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minElem) minElem = arr[i];
            if (arr[i] > maxElem) maxElem = arr[i];
        }
        System.out.println("Минимальный элемент = " + minElem);
        System.out.println("Максимальный элемент равен = " + maxElem);
        System.out.println("Наибольшее по модулю = " + Math.max(Math.abs(minElem), Math.abs(maxElem)));
    }
}
