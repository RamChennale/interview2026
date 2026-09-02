package com.selenium.A2_javaInterviewEx.strings;

public class countVowelsConsonants {
    //aeiou AEIOU

    public static void main(String[] args) {
        String string = "ram chennale";
        countVowelsConsonants(string);
    }

    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        // Convert the entire string to lowercase to simplify checking
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            // Check if the character is a lowercase vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
            // Check if it is a lowercase letter between 'a' and 'z'
            else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    //Count vowels and consonants in a string - 2nd way
    public void countVowelsConsonants1(String str) {
        int vowels = 0, consonants = 0;
        String vowelSet = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelSet.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
