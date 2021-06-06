package com.zel.idea;

import java.util.Scanner;

public class Task11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNumb = scanner.next();
        int numb = scanner.nextInt();
        double intStr = Double.parseDouble(strNumb);
        System.out.println(Math.max(numb, intStr));
        double minNumb = Math.min(numb, intStr);
        System.out.println(minNumb);
    }
}
