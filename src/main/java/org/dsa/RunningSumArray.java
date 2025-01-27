package org.dsa;

import java.util.List;

public class RunningSumArray {
    public static int minStartingValue(List<Integer> nums) {
        int minSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }

    //    public static void main(String[] args) {
    //        int[] nums = {-3, 2, -3, 4, 2};
    //        System.out.println("Minimum starting value: " + minStartingValue(nums));
    //    }
}
