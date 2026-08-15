package Lecture_10;

import java.util.*;

public class DiagonalSum {
    public static void inputMatrix(int[][] mat, Scanner sc) {
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Enter " + (i + 1) + " row of matrix: ");
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dimension of matrix: ");
        int dim = sc.nextInt();

        if (dim < 1) {
            System.out.println("Invalid rows and columns input ");
            sc.close();
            return;
        }

        int[][] mat = new int[dim][dim];

        inputMatrix(mat, sc);

        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];

            if (i != mat.length - 1 - i) {
                sum += mat[i][mat.length - 1 - i];
            }
        }

        System.out.println("The diagonal sum is " + sum);

        sc.close();
    }
}
