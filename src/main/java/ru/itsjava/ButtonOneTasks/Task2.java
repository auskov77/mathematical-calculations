package ru.itsjava.ButtonOneTasks;
//Развернуть число: 123 → 321

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int in = scanner.nextInt();
        int out = 0;
        int inToReverse = Math.abs(in);

        while (inToReverse > 0) {
            int modIn = inToReverse % 10;
            out = out * 10 + modIn;
            inToReverse /= 10;
        }
        System.out.println("Перевернутое исходное число: " + out);

    }
}
