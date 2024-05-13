package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPalindromeTest {

    @Test
    void isWordPalindrome() {
        assertFalse(WordPalindrome.isWordPalindrome("SomePalindrome"));
        assertTrue(WordPalindrome.isWordPalindrome("abcbA"));
    }

}