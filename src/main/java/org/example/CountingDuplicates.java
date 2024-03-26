package org.example;

import java.util.ArrayList;
import java.util.List;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        List<Character> allLowerCaseText = new ArrayList<>();
        for (char ch : text.toLowerCase().toCharArray()) {

            allLowerCaseText.add(ch);
        }
        int numberOfRepeatedChars = 0;
        List<Character> allLowerCaseTextHelper = List.copyOf(allLowerCaseText);
        String lettersAlreadyCounted = "";
        for (int i = 0; i < allLowerCaseTextHelper.size(); i++) {
            Character elementToCheck = allLowerCaseTextHelper.get(i);
            allLowerCaseText.remove(elementToCheck);
            if (allLowerCaseText.contains(elementToCheck) && !lettersAlreadyCounted.contains(elementToCheck.toString())) {
                numberOfRepeatedChars++;
                lettersAlreadyCounted += elementToCheck.toString();
            }
        }
        return numberOfRepeatedChars;
    }

    public static int duplicateCountBest(String text) {
        int ans = 0;
        text = text.toLowerCase();
        while (!text.isEmpty()) {
            String firstLetter = text.substring(0,1);
            text = text.substring(1);
            if (text.contains(firstLetter)) ans ++;
            text = text.replace(firstLetter, "");
        }
        return ans;
    }
}
