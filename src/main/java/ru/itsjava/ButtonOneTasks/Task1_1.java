package ru.itsjava.ButtonOneTasks;
//Развернуть строку: abc → cba

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String in = scanner.nextLine();

        String out = new StringBuilder(in).reverse().toString();

        System.out.println("Развернутая строка: " + out);
    }

}

