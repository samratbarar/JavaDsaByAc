package Lecture_21;

import java.util.*;

// Given a valid string with only () parentheses

public class DupliParentheses {
    public static boolean isContainDupli(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            
            if (currChar != ')') {
                s.push(currChar);
            } else {
                if (s.isEmpty()) {
                    return true;
                }

                boolean isContent = false;

                while (s.peek() != '(') {
                    s.pop();
                    isContent = true;
                }

                if (!isContent) {
                    return true;
                }

                s.pop();
            }
        }

        if (s.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        String str = "((a+b) + (b+c))";

        if (isContainDupli(str)) {
            System.out.println("It contains duplicate parentheses");
        } else {
            System.out.println("It does not contains duplicate parentheses");
        }
    }
}
