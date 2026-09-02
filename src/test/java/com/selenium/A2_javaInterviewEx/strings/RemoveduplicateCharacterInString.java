package com.selenium.A2_javaInterviewEx.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateCharacterInString {

    public static void main(String[] args) {
        String string = "ram chennale";
       System.out.println(removeDuplicateCharacterFromString(string));
    }


    public static String removeDuplicateCharacterFromString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (seen.add(c)) {
                stringBuilder.append(c);
            }
                        }
        return stringBuilder.toString();
    }

}
