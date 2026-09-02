package com.selenium.A2_javaInterviewEx.strings;

import java.util.Arrays;

public class ReverseStringPreservingPositionSpaces {
    public static void main(String[] args) {

        String str = "Java concept of the day";
        reverseWithPosition(str);
    }

    private static void reverseWithPosition(String str) {
        char[] inputStringArray = str.toCharArray();
        char[] resultArray= new char[inputStringArray.length];

        //First for loop :
        //For every space in the 'inputStringArray',
        //we insert spaces in the 'resultArray' at the corresponding positions

        //Initializing 'j' with length of resultArray
        int j= resultArray.length-1;
        System.out.println(j);

        for (int i = 0; i <inputStringArray.length ; i++) {
            if(inputStringArray[i]==' '){
                resultArray[i]=inputStringArray[i];
            }
        }


        //Second for loop :
        //we copy every non-space character of inputStringArray
        //from first to last at 'j' position of resultArray

        for (int i = 0; i <inputStringArray.length; i++) {
            if(inputStringArray[i]!=' '){
                //If resultArray already has space at index j then decrementing 'j'
                if(resultArray[j]== ' '){
                    j--;
                }
                resultArray[j]=inputStringArray[i];
                j--;
            }
        }
        System.out.println(Arrays.toString(resultArray));
        System.out.println(String.valueOf(resultArray));
    }

}
