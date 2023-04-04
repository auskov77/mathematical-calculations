package ru.itsjava.ButtonOneTasks;
//Задача на дубликаты
//Есть символ «о»
//Есть слово «молОко»
//Надо вывести сколько раз встречается буква(не зависимо от регистра)
//ответ 3

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String inputString = scanner.nextLine();
        System.out.println("Введите букву для проверки наличия в слове");
        String inputChar = scanner.nextLine();
        char actualChar = inputChar.toLowerCase().charAt(0);
        int resultCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (actualChar == inputString.toLowerCase().charAt(i)){
                resultCount = resultCount + 1;
            }
        }
        System.out.println("Ответ: Всего букв без учета регистра " + resultCount);
    }
}
