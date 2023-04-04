package ru.itsjava.ButtonOneTasks;
//Посчитать статистику символов в строке
//java → j:1, a:2, v:1

import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();
        char tempChar;
        ArrayList<String> resultString = new ArrayList<>();
        ArrayList<String> tempList = new ArrayList<>();
        int count;

        for (int i = 0; i < inputString.length(); i++) {
            tempChar = inputString.charAt(i);
            count = 0;
            if (!(tempList.contains(String.valueOf(tempChar)))) {
                for (int j = 0; j < inputString.length(); j++) {
                    if ((inputString.charAt(j) == tempChar)) {
                        count = count + 1;
                    }
                }
                tempList.add(String.valueOf(tempChar));
                resultString.add(tempChar + ":" + count);
            }
        }
        System.out.println(resultString);
    }
}
