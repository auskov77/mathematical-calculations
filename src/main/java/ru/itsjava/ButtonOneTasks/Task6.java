package ru.itsjava.ButtonOneTasks;
//Проверить, является ли число палиндромом

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int actualNumber = scanner.nextInt();
        int resultNumber = 0;
        int inToReverse = Math.abs(actualNumber);

        while (inToReverse > 0) {
            int modIn = inToReverse % 10;
            resultNumber = resultNumber * 10 + modIn;
            inToReverse /= 10;
        }

        if (actualNumber == resultNumber){
            System.out.println("Число - палиндром");
        } else {
            System.out.println("Число - не палиндром");
        }

    }
}
