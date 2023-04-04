package ru.itsjava.mytasks_3;

import java.util.*;

public class SearchDuplicateChars {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter word");
        String input = s.nextLine();
        System.out.println("Enter char");
        String c = s.nextLine();

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == c.charAt(0)) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
