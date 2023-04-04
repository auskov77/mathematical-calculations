package ru.itsjava.ButtonOneTasks;
//Проверить, является ли числа анаграммами

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int inputNumberOne = scanner.nextInt();
        System.out.println("Введите второе число:");
        int inputNumberTwo = scanner.nextInt();

        String actualStringOne = Integer.toString(inputNumberOne);
        String actualStringTwo = Integer.toString(inputNumberTwo);

        int[] actualIntOne = new int[actualStringOne.length()];
        for (int i = 0; i < actualStringOne.length(); i++) {
            actualIntOne[i] = Character.getNumericValue(actualStringOne.charAt(i));
        }
        Arrays.sort(actualIntOne);

        int[] actualIntTwo = new int[actualStringTwo.length()];
        for (int i = 0; i < actualStringTwo.length(); i++) {
            actualIntTwo[i] = Character.getNumericValue(actualStringTwo.charAt(i));
        }
        Arrays.sort(actualIntTwo);

        if (Arrays.equals(actualIntOne, actualIntTwo)) {
            System.out.println("Числа являются анаграммами");
        } else {
            System.out.println("Числа НЕ являются анаграммами");
        }
    }
}
