package Lecture_04;

import java.util.*;

// Program to find largest of 3 numbers

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is largest");
        } else if (num2 >= num3) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println(num3 + " is largest");
        }

        sc.close();
    }
}
