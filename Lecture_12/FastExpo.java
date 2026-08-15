package Lecture_12;

import java.util.*;

public class FastExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and positive power");
        int base = sc.nextInt(), power = sc.nextInt();

        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println("The answer is " + ans);

        sc.close();
    }
}
