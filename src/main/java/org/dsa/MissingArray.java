package org.dsa;

public class MissingArray {

    public static int missingNumber(int[] arr) {
        int n = arr.length + 1;
        boolean[] present = new boolean[n + 1];

        for (int num : arr) {
            present[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return -1;
    }
}
