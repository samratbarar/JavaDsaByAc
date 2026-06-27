package JavaDsaByAc.Lecture_08;

import java.util.*;

public class LinearSearch {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int linearSearch(int[] arr, int key) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length/2 + 1; i++) {
            if (key == arr[i]) {
                return i;
            } 

            if (key == arr[arr.length - 1 - i]) {
                return (arr.length - 1 - i);
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] numbers = new int[sc.nextInt()];

        inputArray(numbers, sc);

        System.out.println("Enter the number you want to search");
        int idx = linearSearch(numbers, sc.nextInt());

        if (idx >= 0) {
            System.out.println("Index of key is " + idx);
        } else {
            System.out.println("Key is not found");
        }

        sc.close();
    }
}