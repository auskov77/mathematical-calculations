package ru.itsjava.mytasks_3;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int temp, res = 0, mod;
        temp = Math.abs(x);
        while (temp > 0) {
            mod = temp % 10;
            res = res * 10 + mod;
            temp = temp / 10;
        }
        return x == res;
    }
}
