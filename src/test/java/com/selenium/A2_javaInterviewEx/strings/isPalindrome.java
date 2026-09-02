package com.selenium.A2_javaInterviewEx.strings;

public class isPalindrome {
    public static void main(String[] args) {
        String string1 = "ram";
        String string2 = "NItiN";
        //condition ? expression_if_true : expression_if_false;
        System.out.println(Boolean.parseBoolean(""+ isStringPalindrome(string1)) ? true:false);
        System.out.println(string1+ " is the string Palindrome "+isStringPalindrome(string1));
        System.out.println(string2+ " is the string Palindrome "+isStringPalindrome(string2));

    }

    public static boolean isStringPalindrome(String string){

        string = string.toLowerCase();

        if (string ==null)
            return false;

        int left=0, right=string.length()-1;
        while (left<right){
            if (string.charAt(left) != string.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}
