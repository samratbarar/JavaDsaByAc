package JavaDsaByAc.Lecture_14;

import java.util.*;

public class QuickSort {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int partition(int[] arr, int si, int ei) {
        int tracker = si - 1;
        for (int i = si; i < ei; i++) {
            if (arr[ei] > arr[i]) {
                tracker++;
                int temp = arr[tracker];
                arr[tracker] = arr[i];
                arr[i] = temp;
            }
        }

        tracker++;
        int temp = arr[tracker];
        arr[tracker] = arr[ei];
        arr[ei] = temp;

        return tracker;
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx - 1);
        quickSort(arr, pidx + 1, ei);
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

        quickSort(arr, 0, arr.length - 1);

        displayArray(arr);

        sc.close();
    }
}