package org.example;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();
        for (String w : input.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            result.append(w).append(" ");
        }
        return result.toString().trim();
    }

    public static String camelCaseBetter(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
