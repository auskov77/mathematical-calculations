//метод, который находит букву и количество в слове

package ru.itsjava.algorithm_3_workouts_from_yandex;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FindsAndCountLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String inputWord = scanner.nextLine();
        System.out.println("Введите букву для проверки");
        String inputLetter = scanner.nextLine();
        long characterStream = inputWord.chars()
                .filter(w -> w==inputLetter.charAt(0))
                .count();
        System.out.println("букв " + inputLetter.charAt(0) + " в слове " + characterStream);
    }

    public static int findAndCountLetter(Character inputCharLetter, String inputWord){
        int count = 0;
        for (int i = 0; i < inputWord.length(); i++) {
            if (inputCharLetter == inputWord.charAt(i)){
                count = count + 1;
            }
        }
        return count;
    }
}
