package ru.itsjava.ButtonOneTasks;
//Развернуть число: 123 → 321

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int in = scanner.nextInt();
        int out = 0;

        while (in != 0) {
            out = out * 10;
            out = out + in % 10;
            in = in / 10;
        }

        System.out.println("Перевернутое исходное число: " + out);

    }
}
