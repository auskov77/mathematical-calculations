package ru.itsjava.ButtonOneTasks;
//Написать конвертер систем счисления: обычных чисел в
// римские, десятеричную систему в двоичную, 8- и
// 16-ричную

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число (для конвертации в Римские цифры от 1 до 3999):");
        int inputNumber = scanner.nextInt();
        System.out.println("Выберите метод конвертации: 1 - в Римские цифры, 2 - в Двоичную систему, 3 - в 8-ричную систему, 4 - в 16-ричную систему");
        int methodConvert = scanner.nextInt();
        switch (methodConvert) {
            case 1:
                convertToRomanNumerals(inputNumber);
                break;
            case 2:
                convertToBinary(inputNumber);
                break;
            case 3:
                convertToOctalCode(inputNumber);
                break;
            case 4:
                convertToHexadecimalCode(inputNumber);
                break;
            default:
                System.out.println("Вы НЕ выбрали метод!");
                break;
        }
    }

    public static void convertToRomanNumerals(int number) {
//        В настоящее время в римской системе счисления используются следующие знаки:
//        I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.
//        Все целые числа от 1 до 3999 записываются с помощью приведенных выше цифр. При этом:
//        если большая цифра стоит перед меньшей, они складываются:
//        VI = 5 + 1 = 6; XV = 10 + 5 = 15; LX = 50 + 10 = 60; CL = 100 + 50 = 150;
//        если меньшая цифра стоит перед большей (в этом случае она не может повторяться), то меньшая вычитается из большей;
//        вычитаться могут только цифры, обозначающие 1 или степени 10; уменьшаемым может быть только цифра, ближайшая в числовом ряду
//        к вычитаемой:
//        IV = 5 - 1 = 4; IX = 10 - 1 = 9; XL = 50 - 10 = 40; XC = 100 - 10 = 90;

        int units, tens, hundreds, thousands;
        int coefficientUnits = 1, coefficientTens = 10, coefficientHundreds = 100, coefficientThousands = 1000;
        int oneNumber = 1, fourNumber = 4, fiveNumber = 5, nineNumber = 9;
        String resultUnits, resultTens, resultHundreds, resultThousands;
        StringBuilder result = new StringBuilder();

        if ((number >= 1) && (number <= 3999)) {
            units = number % 10;
            tens = ((number / 10) % 10);
            hundreds = ((number / 100) % 10);
            thousands = ((number / 1000) % 10);

            resultUnits = calculatorOfRomanNumerals(units, oneNumber, fourNumber, fiveNumber, nineNumber, coefficientUnits);
            resultTens = calculatorOfRomanNumerals(tens, oneNumber, fourNumber, fiveNumber, nineNumber, coefficientTens);
            resultHundreds = calculatorOfRomanNumerals(hundreds, oneNumber, fourNumber, fiveNumber, nineNumber, coefficientHundreds);
            resultThousands = calculatorOfRomanNumerals(thousands, oneNumber, fourNumber, fiveNumber, nineNumber, coefficientThousands);

            result.append(resultThousands);
            result.append(resultHundreds);
            result.append(resultTens);
            result.append(resultUnits);

            System.out.println("Ответ: " + result);
        } else {
            System.out.println("Ввели число НЕ в заданных пределах!");
        }
    }

    public static String calculatorOfRomanNumerals(int number, int one, int four, int five, int nine, int coefficient) {
        StringBuilder tempResult = new StringBuilder();
        if (number != 0) {
            if (number <= 3) {
                tempResult.append(String.valueOf(correspondenceOfIntegerAndRomanNumbers(one * coefficient)).repeat(Math.max(0, number)));
            } else if (number == 4) {
                tempResult.append(correspondenceOfIntegerAndRomanNumbers(four * coefficient));
            } else if (number == 5) {
                tempResult.append(correspondenceOfIntegerAndRomanNumbers(five * coefficient));
            } else if (number <= 8) {
                tempResult.append(correspondenceOfIntegerAndRomanNumbers(five * coefficient));
                tempResult.append(String.valueOf(correspondenceOfIntegerAndRomanNumbers(one * coefficient)).repeat(number - 5));
            } else if (number == 9) {
                tempResult.append(correspondenceOfIntegerAndRomanNumbers(nine * coefficient));
            }
        }
        return tempResult.toString();
    }

//делимое   - divisible - a
//делитель  - divisor   - b
//частное   - quotient  - c
//остаток   - remainder - d
// a / b = c
// a % b = d
// 4 / 2 = 2
// 4 % 2 = 0
    public static void convertToBinary(int number) {
//        String result;
//        result = Integer.toBinaryString(number);
//        System.out.println("Ответ: " + result);

        int remainder, quotient;
        StringBuilder resultBinary = new StringBuilder();
        quotient = number;

        while (quotient > 0) {
            remainder = quotient % 2;
            resultBinary.append(remainder);
            quotient = quotient / 2;
        }
        resultBinary.reverse();

        System.out.println("Ответ: " + resultBinary);
    }

    public static void convertToOctalCode(int number) {
        int remainder, quotient;
        StringBuilder resultOctal = new StringBuilder();
        quotient = number;

        while (quotient > 0) {
            remainder = quotient % 8;
            resultOctal.append(remainder);
            quotient = quotient / 8;
        }
        resultOctal.reverse();

        System.out.println("Ответ: " + resultOctal);
    }

    public static void convertToHexadecimalCode(int number) {
        int remainder, quotient;
        StringBuilder resultHexadecimal = new StringBuilder();
        quotient = number;

        while (quotient > 0) {
            remainder = quotient % 16;
            if (remainder >= 10) {
                resultHexadecimal.append(correspondenceOfDecimalAndHexadecimalNumbers(remainder));
            } else {
                resultHexadecimal.append(remainder);
            }
            quotient = quotient / 16;
        }
        resultHexadecimal.reverse();

        System.out.println("Ответ: " + resultHexadecimal);
    }

    public static String correspondenceOfDecimalAndHexadecimalNumbers(int number) {
        String result = "";
        switch (number) {
            case 10:
                result = "A";
                break;
            case 11:
                result = "B";
                break;
            case 12:
                result = "C";
                break;
            case 13:
                result = "D";
                break;
            case 14:
                result = "E";
                break;
            case 15:
                result = "F";
                break;
        }
        return result;
    }

    public static String correspondenceOfIntegerAndRomanNumbers(int number) {
        String result = "";
        switch (number) {
            case 1:
                result = "I";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            case 40:
                result = "XL";
                break;
            case 50:
                result = "L";
                break;
            case 90:
                result = "XC";
                break;
            case 100:
                result = "C";
                break;
            case 400:
                result = "CD";
                break;
            case 500:
                result = "D";
                break;
            case 900:
                result = "CM";
                break;
            case 1000:
                result = "M";
                break;
        }
        return result;
    }
}
