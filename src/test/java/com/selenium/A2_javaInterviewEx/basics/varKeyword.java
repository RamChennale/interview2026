package com.selenium.A2_javaInterviewEx.basics;

import java.util.ArrayList;
/*
The var keyword was introduced in Java 10 (released in 2018).

The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

    */
public class varKeyword {
    public static void main(String[] args){
        var num=10;
        num = 100;
        var name = "Ram";
        //name = 12; // error

        ArrayList<String> al = new ArrayList<>(); // or
        var varAL = new ArrayList<String>();

    }
}
