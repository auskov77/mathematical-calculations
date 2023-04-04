package ru.itsjava.ButtonOneTasks;
//Вывести слова в строке в обратном порядке

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами:");
        String inputString = scanner.nextLine();

        Pattern pattern = Pattern.compile(" ");
        String[] tempWords = pattern.split(inputString);
        StringBuilder outputResult = new StringBuilder();

        for (int i = 0; i < tempWords.length; i++) {
            String out = new StringBuilder(tempWords[i]).reverse().toString();
            if (i == tempWords.length - 1){
                outputResult.insert(0, out);
            } else {
                outputResult.insert(0, " " + out);
            }
        }
        System.out.println(outputResult);
    }
}
