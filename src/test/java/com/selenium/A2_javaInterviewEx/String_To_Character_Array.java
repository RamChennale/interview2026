package com.selenium.A2_javaInterviewEx;

public class String_To_Character_Array {
    public static void main(String[] args){

        String name = "Ram Chennale";

        System.out.println("Original : Ram Chennale : after " +chnageLetterFormat(name));
    }

    public static String chnageLetterFormat(String string){
        char[] charArray = string.toCharArray();

        for(int i=0;    i<charArray.length;    i++){
            if(charArray[i]>=65 && charArray[i]<=90){
                charArray[i] = (char) (charArray[i]+32);
            }
            else if (charArray[i]>=97 && charArray[i]<=122){
                charArray[i] = (char)(charArray[i]-32);
            }
        }
        return new String(charArray);
    }
}
