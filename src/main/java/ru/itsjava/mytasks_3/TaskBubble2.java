package ru.itsjava.mytasks_3;

import java.util.Arrays;
import java.util.Random;

public class TaskBubble2 {
    public static void main(String[] args) {
        int k = 5;
        int intTemp = 0;
        int[] intArray = new int[k];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = new Random().nextInt(k);
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    intTemp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = intTemp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}
