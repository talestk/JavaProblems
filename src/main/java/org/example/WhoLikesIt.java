package org.example;

public class WhoLikesIt {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static String whoLikesIt(String... names) {
        StringBuilder whoLikesItString = new StringBuilder();
        if (names.length == 0) {
            return "no one likes this";
        } else {
            for (int i = 0; i < names.length; i++) {
                if (names.length <= 3) {
                    whoLikesItString.append(names[i]);
                } else {
                    if (i < 2) {
                        whoLikesItString.append(names[i]);
                    }
                }
                if (names.length == 2 && i == 0) {
                    whoLikesItString.append(" and ");
                }
                if (names.length == 3) {
                    if (i == 0) {
                        whoLikesItString.append(", ");
                    } else {
                        if (i+1 < names.length) {
                            whoLikesItString.append(" and ");
                        }
                    }
                }
                if (names.length > 3) {
                    if (i == 0) {
                        whoLikesItString.append(", ");
                    } else if (i == 1) {
                        whoLikesItString.append(" and ");
                    } else {
                        whoLikesItString.append(names.length - 2).append(" others");
                        break;
                    }
                }
            }
            if (names.length == 1) {
                whoLikesItString.append(" likes this");
            } else {
                whoLikesItString.append(" like this");
            }
        }
        return whoLikesItString.toString();
    }

    public static String whoLikesItBetter(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }
}