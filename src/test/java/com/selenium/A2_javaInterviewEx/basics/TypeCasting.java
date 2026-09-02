package com.selenium.A2_javaInterviewEx.basics;



public class TypeCasting {

    public static void main(String[] args) {

        int mark = 91;
        float marks = (float) mark;

        var total = 100;
        double dtotal = (double) total;

        double percentage = (double) mark/ total *100 ;

        System.out.println(percentage);

        String string = "one";
        //int num = (int) string; // error - Inconvertible types; cannot cast 'java.lang.String' to 'int'


    }
}