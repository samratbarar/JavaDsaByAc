package JavaDsaByAc.Lecture_13;

import java.util.*;

// Print all binary strings of size n without consecutive ones.

public class BinaryStringProblem {
    public static void printBinStr(int n, int lastPlace, StringBuilder str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        printBinStr(n - 1, 0, str.append("0"));
        str.deleteCharAt(str.length() - 1);

        if (lastPlace == 0) {
            printBinStr(n - 1, 1, str.append("1"));
            str.deleteCharAt(str.length() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of string");
        printBinStr(sc.nextInt(), 0, new StringBuilder(""));

        sc.close();
    }
}
