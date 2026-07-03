package JavaDsaByAc.Lecture_13;

import java.util.*;

// there is 2Xn sized floor to be filled by 2X1 sized tiles so find number of ways to do this work

public class TilingProblem {
    public static int noOfWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return noOfWays(n - 1) + noOfWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("The number of ways is " + noOfWays(n));

        sc.close();
    }
}
