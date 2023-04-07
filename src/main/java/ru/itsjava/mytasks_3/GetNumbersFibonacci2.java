package ru.itsjava.mytasks_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GetNumbersFibonacci2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index for number Fibonacci: ");
        int n = s.nextInt();
        int[] arrFibo = new int[n];
        arrFibo[0] = 1;
        arrFibo[1] = 1;
        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
        }
        System.out.println(Arrays.toString(arrFibo));
        IntStream resFibo = Arrays.stream(arrFibo);
        resFibo.forEach(f -> System.out.print(f + " "));
    }
}
