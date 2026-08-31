package Lecture_23;

import java.util.HashMap;

public class SubarrSumEqualToK {
    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int k = 10;

        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1); 
        }

        System.out.println("The count of subarray is " + count);
    }
}
