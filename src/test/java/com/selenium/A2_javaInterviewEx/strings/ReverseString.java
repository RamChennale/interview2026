package com.selenium.A2_javaInterviewEx.strings;

import groovyjarjarantlr4.v4.analysis.LeftFactoringRuleTransformer;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Ram Chennale";
        System.out.println(str +" - is reversed as :"+reverseString(str));

    }

    public static String reverseString(String string){
        char[] charsString  = string.toCharArray();
        System.out.println("charsString"+charsString);
        int  left=0, right=charsString.length-1;

        while (left<right){
            char temp =charsString[left];
            charsString [left]= charsString[right];
            charsString[right] = temp;
            left++;
            right--;
        }
        return new String(charsString);
    }
}
