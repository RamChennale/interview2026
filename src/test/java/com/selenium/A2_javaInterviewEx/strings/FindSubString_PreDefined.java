package com.selenium.A2_javaInterviewEx.strings;

public class FindSubString_PreDefined {
    public static void main(String[] args) {
        String mainString = "Welcome to Java Programming";
        String targetSubstring = "Java";

        // Approach 1: Using the contains() method (Returns true/false)
        if (mainString.contains(targetSubstring)) {
            System.out.println("Approach 1: '" + targetSubstring + "' was found in the string.");
        } else {
            System.out.println("Approach 1: '" + targetSubstring + "' was not found.");
        }

        // Approach 2: Using the indexOf() method (Returns the index position or -1)
        int index = mainString.indexOf(targetSubstring);

        if (index != -1) {
            System.out.println("Approach 2: '" + targetSubstring + "' found at index position: " + index);
        } else {
            System.out.println("Approach 2: '" + targetSubstring + "' was not found.");
        }
    }
}
