package ru.itsjava.ButtonOneTasks;
//Реализовать игру FizzBuzz. Написать алгоритм, который
// выводит числа от 1 до N. Если число делится на 3 —
// выводить fizz, если на 5 — buzz, если на 3 и 5 —
// fizz buzz

import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива чисел N:");
        int numberN = scanner.nextInt();
        int[] arrayNumbers = new int[numberN];
//        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = i + 1;
        }

        for (int arrayNumber : arrayNumbers) {
            if ((arrayNumber % 3) == 0) {
//                result.add(arrayNumber + " fizz");
                System.out.println(arrayNumber + " fizz");
            }
            if ((arrayNumber % 5) == 0) {
//                result.add(arrayNumber + " bazz");
                System.out.println(arrayNumber + " bazz");
            }
            if (((arrayNumber % 3) == 0) && ((arrayNumber % 5) == 0)) {
//                result.add(arrayNumber + " fizz bazz");
                System.out.println(arrayNumber + " fizz bazz");
            }
        }
//        System.out.println(result);
    }
}
