package Lecture_21;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String parentheses = "({[]}())";
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < parentheses.length(); i++) {
            char currChar = parentheses.charAt(i);
            
            if (currChar == '(' || currChar == '[' || currChar == '{') {
                s.push(currChar);
            } else {
                if (s.isEmpty()) {
                    System.out.println("It is not valid parentheses");
                    return;
                }

                char sChar = ' ';
                switch (s.peek()) {
                    case '(':
                        sChar = ')';
                        break;

                    case '{':
                        sChar = '}';
                        break;

                    case '[':
                        sChar = ']';
                        break;

                    default:
                        break;
                }

                if (currChar == sChar) {
                    s.pop();
                } else {
                    System.out.println("It is not valid parentheses");
                    return;
                }
            }
        }

        if (s.isEmpty()) {
            System.out.println("It is valid parentheses");
        } else {
            System.out.println("It is not valid parentheses");
        }
    }
}
