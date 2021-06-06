package com.zel.idea;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - расстояние, 2 - масса");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double quantity;
        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.printf("Метры %.0f \n", quantity);
                    System.out.printf("Мили %.3f \n", quantity / 1609);
                    System.out.printf("Ярд %.2f \n", quantity * 1.094);
                    System.out.println("Фут " + quantity * 3.281);
                    break;
                case 2:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.println("Мили " + quantity);
                    System.out.println("Метры " + quantity * 1609);
                    System.out.println("Ярд " + quantity * 1760);
                    System.out.println("Фут " + quantity * 5280);
                    break;
                case 3:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.println("Ярды " + quantity);
                    System.out.println("Метры " + quantity / 1.094);
                    System.out.println("Мили " + quantity / 1760);
                    System.out.println("Фут " + quantity * 3);
                    break;
                case 4:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.println("Фут " + quantity);
                    System.out.println("Метры " + quantity / 3.281);
                    System.out.println("Мили " + quantity / 5280);
                    System.out.println("Ярд " + quantity / 3);
                    break;
                default:
                    System.out.println("default");
            }
        } else if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм");
            int choice2 = scanner.nextInt();
            switch (choice2) {
                case 1:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.println("Грамм " + quantity);
                    System.out.println("Килограмм " + quantity / 1000);
                    break;
                case 2:
                    System.out.println("Введите число");
                    quantity = scanner.nextInt();
                    System.out.println("Килограмм " + quantity);
                    System.out.println("Грамм " + quantity * 1000);
                    break;
                default:
                    System.out.println("default");
            }
        }
    }

    }
