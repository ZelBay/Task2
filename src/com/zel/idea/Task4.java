package com.zel.idea;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double avg = (x + y + z)/3;
        double halfAvg = avg/2;
        if (Math.floor(halfAvg) > 3)
            System.out.println("Программа работает корректно");
}


    }