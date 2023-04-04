package ru.itsjava.ButtonOneTasks;
//Найти наибольший общий делитель (НОД) двух чисел
//НОД - Это максимальное число, на которое без
// остатка делятся оба числа,

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int inputFirstNumber = scanner.nextInt();
        System.out.println("Введите второе целое число:");
        int inputSecondNumber = scanner.nextInt();
        int tempResult;

        if (inputSecondNumber != 0){
            tempResult = inputFirstNumber%inputSecondNumber;
            if (tempResult == 0){
                System.out.println("Число " + inputSecondNumber + " является наибольшим общим делителем");
            } else {
                System.out.println("Число " + inputSecondNumber + " НЕ является наибольшим общим делителем");
            }
        } else {
            System.out.println("Деление на 0 преступно! )))");
        }
    }
}
