package org.example;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        if (string1.length() == string2.length()) {
            // convert strings to char array
            char[] characterArray1 = string1.toCharArray();
            char[] characterArray2 = string2.toCharArray();
            // sort the arrays
            Arrays.sort(characterArray1);
            Arrays.sort(characterArray2);
            // check for equality, if found equal then anagram, else not an anagram
            return Arrays.equals(characterArray1, characterArray2);
        }
        return false;
    }
}

