package org.example;

import org.example.WordPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPalindromeTest {

    @Test
    void isWordPalindrome() {
        Assertions.assertFalse(WordPalindrome.isWordPalindrome("SomePalindrome"));
        assertTrue(WordPalindrome.isWordPalindrome("abcbA"));
    }

}