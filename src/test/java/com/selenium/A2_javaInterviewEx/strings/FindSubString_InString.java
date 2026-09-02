package com.selenium.A2_javaInterviewEx.strings;

import java.util.Scanner;

public class FindSubString_InString {
    public static void main(String[] args) {
        String inputString= "bbb ccc bb";
        String subString= "bb";

        //findSubstring(inputString, subString)     ?subString+" is substring of "+inputString       :subString+" is not substring")

        System.out.println(findSubstring(inputString, subString)?subString+" is substring of "+inputString:subString+" is not substring");
    }

    public static boolean findSubstring(String is, String ss) {
        char stringArray[]= is.toCharArray();
        char[] subStringArray= ss.toCharArray();
        int count =0;
        try{
        for (int i=0;i<stringArray.length;i++) {
            if(String.valueOf(stringArray[i]).equalsIgnoreCase(String.valueOf(subStringArray[count]))) {
                count++;
                if(count==subStringArray.length) {
                    return true;
                }
            }else {
                if(count>0) {
                    count=0;
                    i--;
                }//if
            }//else
        }//for
        }catch (Exception e){
            System.out.println("Getting  Exception as : "+e.getMessage());
        }
        return false;
    }//findSubstring(String is, String ss)
}
