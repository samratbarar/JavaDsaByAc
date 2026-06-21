package JavaDsaByAc.Lecture_04;

import java.util.*;

// Program to make basic calculator

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the operator and operands ");
        char oper = sc.next().charAt(0);
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        switch (oper) {
            case '+' -> System.out.println("The sum is " + (num1 + num2));
            case '-' -> System.out.println("The difference is " + (num1 - num2));
            case '*' -> System.out.println("The product is " + (num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide any number by zero");
                } else {
                    System.out.println("The division is " + ((double) num1 / num2));
                }
            }
            case '%' -> System.out.println("The modulus is " + (num1 % num2));
            default -> System.out.println("Invalid operation");
        }

        sc.close();
    }
}
