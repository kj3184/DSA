package org.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private static final Map<String, String> numPad =
            Map.of(
                    "2", "abc", "3", "def", "4", "ghi", "5", "jkl", "6", "mno", "7", "pqrs", "8",
                    "tuv", "9", "wxyz");

    public static List<String> generateCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }

        backtrack(result, digits, 0, new StringBuilder());
        return result;
    }

    private static void backtrack(
            List<String> result, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = numPad.get(Character.toString(digits.charAt(index)));
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(result, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
