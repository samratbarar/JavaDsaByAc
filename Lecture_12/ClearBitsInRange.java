package JavaDsaByAc.Lecture_12;

import java.util.*;

public class ClearBitsInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        System.out.println("Enter the starting and ending positions ");
        int start = sc.nextInt(), end = sc.nextInt();

        num = num & (((-1) << (end + 1)) | ((1 << start) - 1));

        System.out.println(num);

        sc.close();
    }
}
