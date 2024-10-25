package org.example;

import org.junit.Test;

import java.util.regex.Pattern;


public class RegexTest {


    public static String isValidNumber(String s) {
        // Define the updated regex pattern
        String regex = "^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*))?$|^0(?::=[.,][1-9][0-9]*)$";
                      //^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*)?)?(|(?<=[-+]?\\d)[.,](0|[1-9][0-9]*))$
                      //^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*)?)?(|(?<=[-+]?\\d)[.,]?(?!\\d))$
                      //^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*))?(|(?<=[-+]?\\d)[.,](?!\\d))$
                      //^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*))?(|(?<=[-+]?\\d)[.,](?![0-9]))$
                      //^[+-]?((0)|([1-9][0-9]*))(?:[.,](0|[1-9][0-9]*))?$|^0(?::=[.,][1-9][0-9]*)$

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the input string against the pattern
        if (pattern.matcher(s).matches()) {
            return "YES";
        } else {
            return "NO";
        }
    }

    @Test
    public void testValidNumber() {
        // Sample Inputs
        System.out.println(isValidNumber("123"));  // Output: YES
        System.out.println(isValidNumber("0123")); // Output: NO
        System.out.println(isValidNumber("-56.0")); // Output: YES
        System.out.println(isValidNumber("-0,05")); // Output: YES
        System.out.println(isValidNumber("-23.230")); // Output: NO
        System.out.println(isValidNumber("+12376352189432535347623423443417,36817231873134176345178234234234234")); // Output: YES
    }

}
