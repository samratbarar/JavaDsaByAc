package Lecture_08;

import java.util.*;

public class SubArrays {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void subArrays(int[] arr) {
        if (arr.length == 0) {
            System.out.println("It is empty array");
            return;
        }

        System.out.println("SubArrays are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                for (int k = i; k < j; k++) {
                    if (k == i) {
                        System.out.print("[ ");
                    }

                    System.out.print(arr[k]);

                    if (k != j-1) {
                        System.out.print(", ");
                    }
                }
                System.out.print(" ]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] numbers = new int[sc.nextInt()];

        inputArray(numbers, sc);

        subArrays(numbers);

        sc.close();
    }
}
