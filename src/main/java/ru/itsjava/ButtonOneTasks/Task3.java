package ru.itsjava.ButtonOneTasks;
//Для массива чисел и заданного числа найти пары элементов,
// которые в сумме равны этому числу
//Пример: массив [5,7,8,2,12,30,10,16], требуемая сумма — 15
//Ответ: 5 и 10, 7 и 8

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{5,7,9,11,13,1,3,2,4};
        System.out.println("Дан массив чисел: " + Arrays.toString(arrayInt));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемую сумму: ");
        int inputNumber = scanner.nextInt();

        int firstNumber, secondNumber, temp = 0, result = 0;
        String resultOut;
        ArrayList<String> tempResult = new ArrayList<>();

        for (int k : arrayInt) {
            firstNumber = k;
            temp = temp + 1;
            for (int j = temp; j < arrayInt.length; j++) {
                secondNumber = arrayInt[j];

                if ((firstNumber + secondNumber) == inputNumber) {
                    resultOut = firstNumber + " и " + secondNumber;
                    result = result + 1;
                    tempResult.add(resultOut);
                }
            }
        }
        System.out.println("Пары элементов массива равные по сумме заданному числу: " + tempResult);
    }
}
