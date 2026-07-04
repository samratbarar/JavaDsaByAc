package JavaDsaByAc.Lecture_14;

import java.util.*;

// search key element in sorted rotated array
public class ModifiedBinarySearch {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the elements of sorted rotated array ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return - 1;
        }

        int mid = si + (ei - si) / 2;

        if (tar == arr[mid]) {
            return mid;
        }

        if (arr[mid] >= arr[si]) {
            if (tar >= arr[si] && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            if (tar >= arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array");
        int[] arr = new int[sc.nextInt()];

        inputArray(arr, sc);

        System.out.println("Enter the target element want to search ");
        int idx = search(arr, sc.nextInt(), 0, arr.length - 1);

        if (idx != -1) {
            System.out.println("The index of " + idx);
        } else {
            System.out.println("The target is not found");
        }
       
        sc.close();
    }
}
