package Lecture_08;

import java.util.*;

public class BinarySearch {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of sorted array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (key == arr[mid]) {
                return mid;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            }

            if (key > arr[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of sorted array");
        int[] numbers = new int[sc.nextInt()];

        inputArray(numbers, sc);

        System.out.println("Enter the number you want to search");
        int idx = binarySearch(numbers, sc.nextInt());

        if (idx >= 0) {
            System.out.println("Index of key is " + idx);
        } else {
            System.out.println("Key is not found");
        }

        sc.close();
    }
}
