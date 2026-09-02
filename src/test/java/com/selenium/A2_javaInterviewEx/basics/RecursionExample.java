package com.selenium.A2_javaInterviewEx.basics;

public class RecursionExample {
    public static int sum(int i){
        if(i>0){
            return i+sum(i-1);
        }else {
            return 0;
        }
    }
    public static void main(String[] abc){
        int result = sum(5);
        System.out.println(result);
    }
}
