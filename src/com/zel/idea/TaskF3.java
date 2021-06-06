package com.zel.idea;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskF3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int rowsNumber = scanner.nextInt();
        System.out.println("Введите строки: ");
        String[] str = new String[rowsNumber];
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            str[i] = scanner.next();
        }
        int k = 0;
        for (int i = 0; i < str.length; i++) {
            String[] word = new String[str[i].length()];
            word = str[i].split("");
            for (int j = 0; j < word.length; j++) {
                if (str[i].indexOf(word[j]) == str[i].lastIndexOf(word[j])) {
                    k++;
                }
            }
            arrayList.add(k);
            k = 0;
        }
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) >= max) {
                arrayList1.add(str[i]);
                max = arrayList.get(i);
            } else {
                arrayList1.add(str[0]);
            }
        } System.out.println(arrayList1.get(0));
    }
}
