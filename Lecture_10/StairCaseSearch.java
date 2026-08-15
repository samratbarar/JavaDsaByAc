package Lecture_10;

import java.util.*;

public class StairCaseSearch {
    public static void inputMatrix(int[][] mat, Scanner sc) {
        System.out.println("Enter the elements of sorted matrix: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix: ");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows < 1 || cols < 1) {
            System.out.println("Invalid rows and columns input ");
            sc.close();
            return;
        }

        int[][] mat = new int[rows][cols];

        inputMatrix(mat, sc);

        System.out.println("Enter the number you want to search: ");
        int key = sc.nextInt();

        int currRow = 0, currCol = cols - 1;
        while (currRow < rows && currCol >= 0) {
            if (mat[currRow][currCol] == key) {
                System.out.println("The indices are (" + currRow + ", " + currCol + ")");
                sc.close();
                return;
            } 

            if (key < mat[currRow][currCol]) {
                currCol--;
            } else {
                currRow++;
            }
        }

        System.out.println("The key is not found ");

        sc.close();
    }
}
