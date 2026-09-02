package com.selenium.A2_javaInterviewEx.basics;

public class WrapperClassToParse {
    public static void main(String[] args){
        String num= "123";
        System.out.println("Sting num  "+num);

        int n = Integer.parseInt(num);
        System.out.println("int n "+n);


        System.out.println(" ");

        System.out.println(" ");

        System.out.println(" ");

/*
        In Java, wrapper classes allow primitive data types to be represented as objects. This enables primitives to be used in object-oriented features such as collections, generics, and APIs that require objects.

        Each wrapper class encapsulates a corresponding primitive value inside an object (e.g., Integer for int, Double for double).

        */
//Converting Primitive to Wrapper (Autoboxing)
        int b = 357;

        // Autoboxing: primitive int -> Integer object
        Integer a = b;

        System.out.println("The primitive int b is: " + b);
        System.out.println("The Integer object a is: " + a);


        char ch = 'a';
        // Autoboxing: char -> Character
        Character c = ch;

        // Unboxing: Character -> char
        char cc = ch;



    }
}
