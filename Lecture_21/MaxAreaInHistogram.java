package Lecture_21;

import java.util.*;

public class MaxAreaInHistogram {
    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            int curr = arr[i];

            while (!s.isEmpty() && s.peek() >= curr) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }

            s.push(curr);
        }

        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];

            while (!s.isEmpty() && s.peek() >= curr) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            s.push(curr);
        }

        for (int i = 0; i < arr.length; i++) {
            int currArea = (arr[i] * (nsr[i] - nsl[i] - 1));

            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Maximum area in histogram");
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};

        maxArea(arr);
    }
}
