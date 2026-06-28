package JavaDsaByAc.Lecture_08;

import java.util.*;

public class BuyAndSellStocks {
    public static void inputArray(int[] arr, Scanner sc) {
        System.out.println("Enter the stock prices");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static int calcMaxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Can we beat the current best profit by selling today?
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            // Would today be a cheaper day to have bought?
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements of array :");
        int[] prices = new int[sc.nextInt()];

        inputArray(prices, sc);

        System.out.println("The maximum profit is " + calcMaxProfit(prices));

        sc.close();
    }
}
