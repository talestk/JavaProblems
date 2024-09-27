package org.example;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class StringAssertsExample {

    @Test
    public void stringAsserts() {
        String actual = "AssertJ is a great library for writing tests";

        // Check if the string is equal to the expected value (case-insensitive)
        assertThat(actual)
                .isEqualToIgnoringCase("assertj is a great library for writing tests");

        // Check if the string starts with the specified prefix
        assertThat(actual)
                .startsWith("AssertJ");

        // Check if the string ends with the specified suffix
        assertThat(actual)
                .endsWith("writing tests");

        // Check if the string contains the specified substring
        assertThat(actual)
                .contains("great");

        // Check if the string matches the specified regular expression
        assertThat(actual)
                .matches("AssertJ.*library.*writing tests");

        // Check if the string has the specified length
        assertThat(actual)
                .hasSize(42);

        // Check if the string is empty
        String emptyString = "";
        assertThat(emptyString)
                .isEmpty();

        // Check if the string is not empty
        assertThat(actual)
                .isNotEmpty();
    }
}