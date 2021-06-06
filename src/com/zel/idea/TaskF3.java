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
        for (int i = 0; i < str.length; i++) {                 //вводим строки с клавиатуры
            str[i] = scanner.next();
        }
        int k = 0;
        for (int i = 0; i < str.length; i++) {                 //пробегаемся по словам в массиве строк, вычисляем количество различных символов
            String[] word = new String[str[i].length()];       //и добавялем их в динамический массив
            word = str[i].split("");
            for (int j = 0; j < word.length; j++) {
                if (str[i].indexOf(word[j]) == str[i].lastIndexOf(word[j])) {
                    k++;
                }
            }
            arrayList.add(k);
            k = 0;
        }
        int max = arrayList.get(0);                            //вычисляем максимальный элемент динамического массива
        int indexOfMax = 0;                                    //и по индексу макс. элемента выводим слово из массива строк
        for (int i = 1; i < arrayList.size(); i++) {           //с таким же индексом
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        indexOfMax = arrayList.indexOf(max);
        System.out.println(str[indexOfMax]);
    }
}
