package JavaDsaByAc.Lecture_07;

import java.util.*;

public class BinCoeff {
    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int fact = n;
        for (int i = 2; i < n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int binCoeff(int n, int r) {
        return (factorial(n) / (factorial(r) * factorial(n - r)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n and r");
        System.out.println("The Binary coefficient is " + binCoeff(sc.nextInt(), sc.nextInt()));

        sc.close();
    }
}