package ru.itsjava.mytasks_3;

import java.util.*;

public class SearchDuplicateNumbers {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(n);
        }
        System.out.println(Arrays.toString(arr));
        int temp, count;
        Map<Integer, Integer> resArr = new HashMap<>();
        for (int k : arr) {
            temp = k;
            count = 0;
            for (int i : arr) {
                if (temp == i) {
                    count = count + 1;
                }
            }
            resArr.put(temp, count);
        }
        System.out.println(resArr);
    }
}
