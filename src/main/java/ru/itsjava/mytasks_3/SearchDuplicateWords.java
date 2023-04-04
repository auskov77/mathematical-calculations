package ru.itsjava.mytasks_3;

import java.util.*;

public class SearchDuplicateWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter words");
        String inWords = s.nextLine();
        System.out.println("Enter word");
        String inWord = s.nextLine();
        int count = 0;
        String[] tempWords = inWords.split(" ");
        for (String tempWord : tempWords) {
            if (tempWord.equals(inWord)) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
