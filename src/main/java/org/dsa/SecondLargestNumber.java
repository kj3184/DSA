package org.dsa;

public class SecondLargestNumber {

    public static int secondLargest(int[] arr) {
        int max_val = arr[0];
        int secondLargest = 0;
        for (int num : arr) {
            if (num > max_val) {
                secondLargest = max_val;
                max_val = num;
            } else if (num > secondLargest && num != max_val) {
                secondLargest = num;
            }
        }

        return (secondLargest == 0 ? -1 : secondLargest);
    }
}
