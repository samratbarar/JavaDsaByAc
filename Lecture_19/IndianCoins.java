package Lecture_19;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        int[] currency = {1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        int amount = 590;

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int i = currency.length - 1;

        while (amount > 0) {
            if (currency[i] <= amount) {
                count++;
                ans.add(currency[i]);
                amount -= currency[i];
            } else {
                i--;
            }
        }

        System.out.println("The number of coins/notes is " + count);
        System.out.println(ans);
    }
}
