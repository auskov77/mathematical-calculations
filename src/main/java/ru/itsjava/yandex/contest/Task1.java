package ru.itsjava.yandex.contest;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[,\\s+]");
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println("Результат сложения чисел a и b:");
        System.out.println(a + b);
    }
}
