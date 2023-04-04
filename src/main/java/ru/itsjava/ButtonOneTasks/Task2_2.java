package ru.itsjava.ButtonOneTasks;
//Развернуть число: 123 → 321

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int in = scanner.nextInt();
        int out = recursiveReverse(in, 0);
        System.out.println("Перевернутое исходное число: ");
//        recursiveReverseMethodIn(in);
        System.out.println(out);

    }

//    public static void recursiveReverseMethodIn(int number) {
//       if (number < 10){
//           System.out.println(number);
//           return;
//       } else {
//           System.out.print(number%10);
//           recursiveReverseMethodIn(number/10);
//       }
//    }

    public static int recursiveReverse(int number, int reverse) {
        if (number != 0){
            reverse = reverse * 10;
            reverse = reverse + number%10;
            number = number/10;
        } else {
            return reverse;
        }
        return recursiveReverse(number, reverse);
    }

}
