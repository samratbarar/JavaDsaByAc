package Lecture_08;

import java.util.*;

public class TrappingRainwater {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the height of bars");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int findTrapWater(int[] arr) {
        // initialize helping arrays to store maximum left boundary and right also
        int[] maxLeftBoundary = new int[arr.length];
        int[] maxRightBoundary = new int[arr.length];

        // as for left there is no boundary so filled with its own height and similar for right but from backward side 
        maxLeftBoundary[0] = arr[0];
        maxRightBoundary[arr.length - 1] = arr[arr.length - 1];

        // Now filling maximum height comparing previous and current for left
        // and next and current for right
        for (int i = 1; i < arr.length; i++) {
            maxLeftBoundary[i] = Math.max(maxLeftBoundary[i - 1], arr[i]);
            maxRightBoundary[arr.length - 1 - i] = Math.max(maxRightBoundary[arr.length - i], arr[arr.length - 1 - i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            // Then finding minimum height of boundary btw left and right to get trap water height 
            // then if trap water height minus by bar height to get water because width is 1
            // As (Trap water height - bar height) * width of bar = trapped water
            // and stores the value of trapped water and adding them.
            trappedWater += ((Math.min(maxLeftBoundary[i], maxRightBoundary[i])) - arr[i]);
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array :");
        int[] heights = new int[sc.nextInt()];

        inputArray(heights, sc);

        System.out.println("The Trapped water is " + findTrapWater(heights));

        sc.close();
    }
}
