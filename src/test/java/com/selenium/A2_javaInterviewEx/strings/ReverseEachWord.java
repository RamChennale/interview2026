package com.selenium.A2_javaInterviewEx.strings;

public class ReverseEachWord {

    public static void main(String[] args) {

        String string = "welcome to java 2026";

        String[] splitArray = string.split(" ");
        for (int i = splitArray.length - 1; i >= 0; i--) { //arr index starts with 0.
            System.out.print(splitArray[i]+" ");
        }

        System.out.println("");

    /*    String string1= "11 22  33 444 55";

        String[] splitStringArray =  string1.split(" ");
        for(int i=splitStringArray.length-1; i>0; i--){
            System.out.print(splitStringArray[i]+" ");
        }*/
    }
}