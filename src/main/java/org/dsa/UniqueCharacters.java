package org.dsa;

/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
 */

import java.util.HashSet;

public class UniqueCharacters {

    public static boolean isUnique(String inputString) {
        char[] charArr = inputString.toCharArray();
        int length = charArr.length;
        HashSet<Character> charSet = new HashSet<>();
        for (char c : charArr) {
            charSet.add(c);
        }

        return (charSet.size() == length);
    }
}

/*
Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
Hints: f t , #84, #122, #131
 */
