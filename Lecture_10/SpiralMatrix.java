package JavaDsaByAc.Lecture_10;

import java.util.*;

public class SpiralMatrix {
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

        System.out.println("Enter the number of rows and columns of matrix ");
        int rows = sc.nextInt(), cols = sc.nextInt();

        if (rows < 1 || cols < 1) {
            System.out.println("Invalid rows and columns input ");
            sc.close();
            return;
        }

        int[][] mat = new int[rows][cols];

        inputMatrix(mat, sc);

        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(mat[rowStart][i] + " ");
            }

            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(mat[i][colEnd] + " ");
            }

            colEnd--;

            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(mat[rowEnd][i] + " ");
                }

                rowEnd--;
            }

            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(mat[i][colStart] + " ");
                }

                colStart++;
            }
        }

        sc.close();
    }
}