package com.zel.idea;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> stringList = Arrays.stream(strArr).filter(word -> word.chars().mapToObj(c -> (char) c).allMatch(character -> alphabet.indexOf(character) != -1)).collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("Количество слов: " + (stringList.size()));
    }
}
