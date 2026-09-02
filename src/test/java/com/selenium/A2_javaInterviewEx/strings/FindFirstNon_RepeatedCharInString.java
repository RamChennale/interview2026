package com.selenium.A2_javaInterviewEx.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNon_RepeatedCharInString {
    //Find the first non-repeated character in a string
    public static Character firstNonRepeatedChar(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }
        return null;
    }
}
