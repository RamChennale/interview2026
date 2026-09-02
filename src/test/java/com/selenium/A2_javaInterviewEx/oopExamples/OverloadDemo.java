package com.selenium.A2_javaInterviewEx.oopExamples;

public class OverloadDemo {

    static int my_Sum(int a, int b) {
        return a + b;
    }

    static int my_Sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println(
                "my_Sum with 2 int parameters: "
                        + my_Sum(4, 6));

        System.out.println(
                "my_Sum with 3 int parameters: "
                        + my_Sum(4, 6, 7));
    }
}