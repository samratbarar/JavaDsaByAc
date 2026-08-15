package Lecture_14;

import java.util.*;

public class MergeSort {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si, idx2 = mid + 1, count = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[count++] = arr[idx1++];
            } else {
                merged[count++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[count++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[count++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void displayArray(int[] arr) {
        System.out.println("Elements of sorted array are ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        divide(arr, 0, arr.length - 1);

        displayArray(arr);

        sc.close();
    }
}
