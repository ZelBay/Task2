package com.zel.idea;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] Mas1 = {1, 2, 3, 4, 5};
        int num1 = Mas1[0];
        Mas1[0] = Mas1[Mas1.length - 1];
        Mas1[Mas1.length - 1] = num1;
        int num2 = Mas1[0] + Mas1[2];
        System.out.print(num2);
    }

}
