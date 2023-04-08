//В основном идея состоит в том, чтобы использовать стек и добавить открывающие круглые скобки, и
// если мы обнаружим закрывающие круглые скобки того же типа, вытолкнуть элемент
//
//Подход
//Использование цикла for для обхода всей строки s и проверки, является ли s.charAt(i) (/{/[,
// помещает символ в стек, и если во время обхода мы находим ')', а верхний элемент стека равен ' (',
// вставьте верхний элемент. Мы возвращаем st.isEmpty (), если да, true, потому что все открывающие скобки
// выталкивают равные закрывающие скобки
package ru.itsjava.mytasks_3;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println("isValid(s1) = " + isValid(s1));
        System.out.println("isValid(s2) = " + isValid(s2));
        System.out.println("isValid(s3) = " + isValid(s3));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.empty()) {
                return false;
            } else if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}
