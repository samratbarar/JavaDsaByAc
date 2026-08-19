package Lecture_21;

import java.util.*;

public class NextGreaterEle {
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] nextGreater = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];

            while (!s.isEmpty() && s.peek() <= curr) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = s.peek();
            }

            s.push(curr);
        }

        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();
    }
}
