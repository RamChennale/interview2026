package com.selenium.A2_javaInterviewEx.strings;

public class ReverseEachWordsPreservingSentance {
        public static String reverseEachWord(String sentence) {
            if (sentence == null || sentence.isEmpty()) {
                return sentence;
            }
            // Split the sentence by one or more spaces
            String[] words = sentence.split("\\s+");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                // Reverse the individual word
                StringBuilder reversedWord = new StringBuilder(word).reverse();
                // Append the reversed word and a space
                result.append(reversedWord).append(" ");
            }

            // Trim the trailing space and return
            return result.toString().trim();
        }

        public static void main(String[] args) {
            String input = "Java is fun";
            String output = reverseEachWord(input);

            System.out.println("Original: " + input);
            System.out.println("Reversed: " + output);
            // Output: avaJ si nuf
        }
    }


