package com.selenium.A2_javaInterviewEx.basics;

public class NestedTernary {

    public static void main(String[] args){

        int time =22;
        String result =   (time>18)?"good day" : "good eveing ";
        System.out.println( (time>18)?"good day" : "good eveing ");


        var time1 = 22;

        String messge;

        messge= (time1>12) ? "Good morning "
                :(time1<18) ? "Good afternoon"
                :"Good eveing";

        System.out.println("messge :  "+ messge);


        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        }

        if (a>b || a>c){
            System.out.println("any one conditions is true");
        }

        System.out.println("Use NOT (!) to reverse a condition:");

        var m =20;
        var n =33;
        if (!(m > n)) {
            System.out.println("m is NOT greater than n");
        }

    }



}

