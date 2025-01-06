package org.dsa;

public class AdjacentArray {
    public static String largestNumber(String num) {
        char[] digits = num.toCharArray();
        for (int i = 0; i < digits.length - 1; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if ((digits[i] - '0') % 2 == (digits[j] - '0') % 2 && digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return new String(digits);
    }

    public static void main(String[] args) {
        String num = "2736";
        System.out.println("Largest number: " + largestNumber(num));
    }
}
