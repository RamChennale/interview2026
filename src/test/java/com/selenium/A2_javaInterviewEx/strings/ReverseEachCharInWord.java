package com.selenium.A2_javaInterviewEx.strings;

import java.util.Arrays;

public class ReverseEachCharInWord {

    public static void main(String[] args) {
        String str = "Java concept";
        reverseEachWord(str);
    }

    private static void reverseEachWord(String str) {
        String reverseString="";
        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));
        for (int i =0;i<words.length;i++) {
            String reverseWord="";
            String word= words[i]; //total words are 5
            for (int j = word.length()-1; j>=0 ; j--) {
                reverseWord=reverseWord+word.charAt(j);
            }
            reverseString=reverseString+reverseWord +" " ;
        }

        System.out.println("Original String: "+str);
        System.out.println("Reverse each word: " +reverseString);
        //smart way:
        //System.out.println(new StringBuffer("Java Concept Of The Day").reverse().toString()); //reverse entire string
    }
}
