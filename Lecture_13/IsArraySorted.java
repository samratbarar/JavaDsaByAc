package Lecture_13;

import java.util.*;

public class IsArraySorted {
    public static boolean isSorted(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }

        if (arr[n] > arr[n + 1]) {
            return false;
        }

        return isSorted(arr, n+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        if (arr.length == 0) {
            System.out.println("Invalid input of length");
            sc.close();
            return;
        }

        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));

        sc.close();
    }
}
