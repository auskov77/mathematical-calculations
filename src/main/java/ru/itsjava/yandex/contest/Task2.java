package ru.itsjava.yandex.contest;

import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("src/main/resources/input.txt"));
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        PrintWriter printWriter = new PrintWriter("src/main/resources/output.txt");
        printWriter.print(a+b);
        printWriter.close();
    }
}
