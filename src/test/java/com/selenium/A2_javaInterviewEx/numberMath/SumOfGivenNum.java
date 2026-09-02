package com.selenium.A2_javaInterviewEx.numberMath;

public class SumOfGivenNum {

    public static void main(String[] args){
        int num = 123, rem=0, sum=0;
        System.out.println("Sum of :"+num );
        while (num>0){
            rem = num%10;
            sum = sum +rem;
            num = num/10;
        }
        System.out.println(" is "+sum);
    }
}
