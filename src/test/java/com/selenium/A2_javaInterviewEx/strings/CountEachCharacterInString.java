package com.selenium.A2_javaInterviewEx.strings;
import java.util.HashMap;

public class CountEachCharacterInString {
    public static void main(String[] args) {
        String string = "ram chennale";
        countCharacters(string);
    }

    public static void countCharacters(String str) {
        HashMap<Character, Integer> counts = new HashMap<>();
        for (char c:str.toCharArray()){
            counts.put(c, counts.getOrDefault(c,0)+1);
        }
        System.out.println(counts);
    }

}
/*

Character frequency count in a string
public static Map<Character, Integer> charFrequency(String str) {
    Map<Character, Integer> freq = new LinkedHashMap<>();
    for (char c : str.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }
    return freq;
}*/
