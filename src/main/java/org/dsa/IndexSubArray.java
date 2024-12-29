package org.dsa;

import java.util.ArrayList;

public class IndexSubArray {
    public static ArrayList<Integer> subArraySum(int[] arr, int target) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1];
        prefixSum[0] = 0;

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        int left = 0, right = 1;
        while (right <= n) {
            int currentSum = prefixSum[right] - prefixSum[left];

            if (currentSum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1);
                result.add(right);
                return result;
            } else if (currentSum < target) {
                right++;
            } else {
                left++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }
}
