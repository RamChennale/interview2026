package com.selenium.A2_javaInterviewEx.strings;

import java.util.Arrays;

/*
A word or phrase that is made by arranging the letters of another word or phrase in a different order
‘Worth’ is an anagram of ‘throw’.
*/

public class TwoStringsAreAnagrams {
    //Check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
