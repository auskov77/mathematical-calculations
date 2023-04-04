package ru.itsjava.ButtonOneTasks;
//Проверить, является ли строка палиндромом
// (читается одинаково слева направо и справа
// налево)

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        StringBuilder reverseString = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String actualString = scanner.nextLine();

        for (int i = 0; i < actualString.length(); i++) {
            reverseString.insert(0, actualString.charAt(i));
        }

        if (actualString.equals(reverseString.toString())){
            System.out.println("Строка - палиндром");
        } else {
            System.out.println("Строка - не палиндром");
        }
    }
}
