//1. Отсортируйте элементы массива строк с именем «strs» в лексикографическом (алфавитном)
//   порядке с помощью метода Arrays.sort(strs).
//2. Присвойте первый элемент отсортированного массива (лексикографически наименьшую строку)
//   строковой переменной s1.
//3. Присвойте последний элемент отсортированного массива (самую большую лексикографически строку)
//   строковой переменной s2.
//4. Инициализировать целочисленную переменную idx значением 0.
//5. Запустите цикл while, который продолжается, пока idx меньше длины s1 и s2.
//6. В цикле while проверьте, равен ли символ с текущим индексом в s1 символу с тем же индексом в s2.
//   Если символы равны, увеличьте значение idx на 1.
//7. Если символы не равны, выйдите из цикла while.
//8. Возвращает подстроку s1, которая начинается с первого символа и заканчивается idx-м символом (не включая).
package ru.itsjava.mytasks_3;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1, s2;
        s1 = strs[0];
        s2 = strs[strs.length - 1];
        int idx = 0;
        while ((idx < s1.length()) && (idx < s2.length())){
            if (s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0,idx);
    }
}
