package com.selenium.A2_javaInterviewEx.strings;

import java.util.Scanner;

public class CharacterTotalCount {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        String string = "aa bb ccc d";
        int count=0;
        char[] charsArray=string.toCharArray();
        for (char ch: charsArray){
            //System.out.print(ch);
            if (ch!=0 && ch!=' '){
                count++;
            }
        }
    System.out.println(STR."Num of charters : \{count}");

        System.out.println("____________________________");

        int counter=0;
        for (int i=0; i<string.length();i++){
             if(string.charAt(i)!=' '){
                 counter++;
             }
        }
        System.out.println(STR."The num of characters in given string :\{string} - are : \{counter}");

    }
}
