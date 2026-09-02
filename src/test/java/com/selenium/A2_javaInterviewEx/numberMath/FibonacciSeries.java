package com.selenium.A2_javaInterviewEx.numberMath;

public class FibonacciSeries {

    public static void main(String[] args) {
        int a = 0, b = 1,temp, n = 10;
        System.out.print(a + "," + b);
        while (n > 0) {
            temp = a + b;
            a = b;
            b = temp;
            n--;
            System.out.print("," + temp);
        }
    }
}
//0,1,1,2,3,5,8,13,21,34,55,89