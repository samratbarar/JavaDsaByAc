package Lecture_17;

import java.util.*;

public class MaxWaterCon {
    public static int storeWater(ArrayList<Integer> heights) {
        int maxWater = 0;

        for (int i = 0; i < heights.size(); i++) {
            for (int j = i + 1; j < heights.size(); j++) {
                int height = Math.min(heights.get(i), heights.get(j));
                int width = (j - i);
                int water = height * width;

                maxWater = Math.max(maxWater, water);
            }
        }

        return maxWater;
    }

    public static int storeWaterBy2P(ArrayList<Integer> heights) {
        int maxWater = 0;
        int left = 0, right = heights.size() - 1;

        while (left < right) {
            int height = Math.min(heights.get(left), heights.get(right));
            int width = (right - left);
            int water = height * width;

            if (heights.get(left) > heights.get(right)) {
                right--;
            } else {
                left++;
            }

            maxWater = Math.max(maxWater, water);
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println("Max water that can be store is " + storeWater(heights));
        System.out.println("Max water that can be store is " + storeWaterBy2P(heights));

        sc.close();
    }
}