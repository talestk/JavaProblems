package org.example;

public class WordPalindrome {
    public static boolean isWordPalindrome(String word) {
        word = word.toLowerCase();
        String reverseWord = getReverseWord(word);
        //if word equals its reverse, then it is a palindrome
        if (word.equals(reverseWord)) {
            return true;
        }
        return false;
    }

    public static String getReverseWord(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.charAt(word.length()- 1) + getReverseWord(word.substring(0, word.length() - 1));
    }
}
