package Lecture_17;

import java.util.*;

public class PairSumOfRotatedArr {
    public static int[] pairSum(ArrayList<Integer> nums, int target) {
        int left = 0, right = nums.size() - 1;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                right = i; 
                left = i + 1;
                break;
            }
        }
        
        while (left != right) {
            long sum = (long)nums.get(left) + nums.get(right);

            if (sum == target) {
                return new int[] {left, right};
            }

            if (sum > target) {
                right = (nums.size() + right - 1) % nums.size();
            } else {
                left = (left + 1) % nums.size();
            }
        }

        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(11);
        nums.add(15);
        nums.add(6);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        System.out.println("Enter the required sum ");
        int target = sc.nextInt();

        int[] indices = pairSum(nums, target);
        System.out.println(Arrays.toString(indices));

        sc.close();
    }
}
