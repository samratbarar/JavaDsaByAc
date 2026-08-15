package Lecture_07;

import java.util.*;

public class PrimeNum {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int range) {
        if (range < 2) {
            System.out.println("Enter valid range");
        }

        System.out.println("Prime numbers up to " + range + ":");
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range of numbers");
        primeInRange(sc.nextInt());

        sc.close();
    }
}