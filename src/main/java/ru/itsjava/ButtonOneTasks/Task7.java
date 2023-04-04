package ru.itsjava.ButtonOneTasks;
//Проверить, являются ли строки анаграммами
// (состоят из одних и тех же букв)

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String inputStringOne = scanner.nextLine();
        char[] actualOne = inputStringOne.toCharArray();
        Arrays.sort(actualOne);

        System.out.println("Введите вторую строку:");
        String inputStringTwo = scanner.nextLine();
        char[] actualTwo = inputStringTwo.toCharArray();
        Arrays.sort(actualTwo);

        if (inputStringOne.length() != inputStringTwo.length()) {
            System.out.println("Строки НЕ являются анаграммами");
        } else if (Arrays.equals(actualOne, actualTwo)){
            System.out.println("Строки являются анаграммами");
        } else {
            System.out.println("Строки НЕ являются анаграммами");
        }
    }
}
