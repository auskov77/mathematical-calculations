package ru.itsjava.ButtonOneTasks;
//Найти в массиве числа, у которых нет дубликата в
// этом же массиве: [1,2,3,1,2] → 3

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arrayInt = new int[]{1, 2, 3, 1, 2};
        System.out.println("Дан массив: " + Arrays.toString(arrayInt));
        int[] tempArrInt = new int[arrayInt.length];
        int firstNumber, secondNumber, temp = 0;
        ArrayList<Integer> resArr = new ArrayList<>();

        Arrays.sort(arrayInt);

        for (int i = 0; i < arrayInt.length; i++) {
            firstNumber = arrayInt[i];
            temp = temp + 1;
            for (int j = temp; j < arrayInt.length; j++) {
                secondNumber = arrayInt[j];
                if (tempArrInt[i] != 0) {
                    break;
                } else {
                    if (firstNumber == secondNumber) {
                        tempArrInt[i] = 1;
                        tempArrInt[j] = 1;
                    } else {
                        tempArrInt[i] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < tempArrInt.length; i++) {
            if (tempArrInt[i] == 0) {
                resArr.add(arrayInt[i]);
            }
        }
        System.out.println("Числа, у которых нет дубликата в этом массиве: " + resArr);
    }
}
