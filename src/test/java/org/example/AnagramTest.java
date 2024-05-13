package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void checkAnagram() {
        assertTrue(Anagram.checkAnagram("asdf", "adsf"));
        assertFalse(Anagram.checkAnagram("asdf", "adsafasff"));
        assertTrue(Anagram.checkAnagram("asdfhhr", "adsfhrh"));
    }
}