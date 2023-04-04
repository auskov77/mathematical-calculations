package ru.itsjava.ButtonOneTasks;
//Развернуть строку: abc → cba

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String in = scanner.nextLine();

        for (int i = 0; i < in.length(); i++) {
            out.append(in.charAt(i));
//            out.insert(0, in.charAt(i));
        }
        out.reverse();
        System.out.println("Развернутая строка: " + out);
    }
}
