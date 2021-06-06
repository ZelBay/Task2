package com.zel.idea;

import java.util.Scanner;

public class TaskF4 {
    public static void main(String[] args) {
        String answer = "Заархивированный вирус";
        String hint = "Ответ связан с IT";
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("Если затрудняешься ответить, можно воспользоваться подсказкой. Для этого напиши 'Подсказка'");
        Scanner scanner = new Scanner(System.in);
        String trying1 = scanner.nextLine();
        if (trying1.equals("Подсказка")) {
            System.out.println(hint);
            String tryingWithHint = scanner.nextLine();
            if (tryingWithHint.equals(answer)) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
            }
        } else if (trying1.equals(answer)) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Подумай еще!");
            String trying2 = scanner.nextLine();
            if (trying2.equals("Подсказка")) {
                System.out.println("Подсказка уже не доступна");
                trying2 = scanner.nextLine();
            }
            if (trying2.equals(answer)) {
                System.out.println("Правильно!");
            } else if (!(trying2.equals(answer))) {
                System.out.println("Подумай еще!");
                String trying3 = scanner.nextLine();
                if (trying3.equals("Подсказка")) {
                    System.out.println("Подсказка уже не доступна");
                    trying3 = scanner.nextLine();
                }
                if (trying3.equals(answer)) {
                    System.out.println("Правильно!");
                } else if (!(trying3.equals(answer))) {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}
