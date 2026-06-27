package JavaDsaByAc.Lecture_08;

import java.util.*;

public class PairsInArray {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void pairs(int[] arr) {
        if (arr.length == 0) {
            System.out.println("It is empty array");
            return;
        }

        System.out.println("Pairs are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] numbers = new int[sc.nextInt()];

        inputArray(numbers, sc);

        pairs(numbers);

        sc.close();
    }
}