package Lecture_21;

import java.util.*;

public class RevStack {
    public static void pushingAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushingAtBottom(data, s);
        s.push(top);
    }

    public static void revStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        revStack(s);
        pushingAtBottom(top, s);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());           
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printStack(s);
        revStack(s);
        printStack(s);
    }
}
