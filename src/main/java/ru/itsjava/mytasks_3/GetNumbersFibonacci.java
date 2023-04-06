package ru.itsjava.mytasks_3;

import java.util.*;
import java.util.stream.*;

public class GetNumbersFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index for number Fibonacci: ");
        int n = s.nextInt();
        int[] arrFibo = new int[n];
        int[] resFibo = new int[arrFibo.length - 1];
        arrFibo[0] = 0;
        arrFibo[1] = 1;
        resFibo[0] = arrFibo[1];
        Map<Integer, Integer> mapFibo = new HashMap<>();
        mapFibo.put(0, arrFibo[0]);
        mapFibo.put(1, arrFibo[1]);
        for (int i = 2; i < arrFibo.length; i++) {
            arrFibo[i] = arrFibo[i - 1] + arrFibo[i - 2];
            resFibo[i - 1] = arrFibo[i];
            mapFibo.put(i, arrFibo[i]);
        }
        IntStream stream = Arrays.stream(arrFibo);
        stream.skip(1).forEach((a) -> System.out.print(a + " "));
        System.out.println();
        IntStream stream1 = Arrays.stream(arrFibo);
        stream1.filter(f -> f != 0).forEach(b -> System.out.print(b + " "));
        System.out.println();

        System.out.println(Arrays.toString(arrFibo));
        System.out.println(mapFibo);
        System.out.println(Arrays.toString(resFibo));
    }
}
