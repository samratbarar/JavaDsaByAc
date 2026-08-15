package Lecture_12;

import java.util.*;

public class IsPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is power of 2");
        } else {
            System.out.println(num + " is not power of 2");
        }

        sc.close();
    }
}
