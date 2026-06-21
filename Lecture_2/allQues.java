package JavaDsaByAc.Lecture_2;

import java.util.*;

// basic programs of sum, product and area of circle

public class allQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println("The sum and product of given numbers are " + (num1+num2) + " and " + (num1*num2));

        System.out.println("Enter the radius of circle");
        double rad = sc.nextDouble();

        System.out.println("The area of circle is " + (Math.PI*rad*rad));

        sc.close();
    }
}
