package JavaDsaByAc.Lecture_12;

import java.util.*;

public class ModularExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base, positive power and modulus");
        int base = sc.nextInt(), power = sc.nextInt(), mod = sc.nextInt();

        long ans = 1, b = base % mod;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans = (ans*b) % mod;
            }

            b = (b * b) % mod;
            power = power >> 1;
        }

        System.out.println("The answer is " + ans);

        sc.close();
    }
}
