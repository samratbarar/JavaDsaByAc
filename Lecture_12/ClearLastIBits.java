package Lecture_12;

import java.util.Scanner;

public class ClearLastIBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        System.out.println("Enter the value of i ");
        int i = sc.nextInt();

        // for (int j = 0; j < i; j++) { --> my approach
        //     num = num & ~(1 << j);
        // }

        num = num & ((-1) << i);
        System.out.println(num);

        sc.close();
    }
}
