package JavaDsaByAc.Lecture_05;

import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if (num <= 0 || num == 1) {
            System.out.println("The given number is not prime");
            sc.close();
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("The given num is not prime");
                sc.close();
                return;
            }
        }

        System.out.println("The given number is prime");

        sc.close();
    }
}
