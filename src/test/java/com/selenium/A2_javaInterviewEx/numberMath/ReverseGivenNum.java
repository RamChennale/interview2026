package com.selenium.A2_javaInterviewEx.numberMath;

import java.util.Scanner;

public class ReverseGivenNum {

    public static void main(String[] args) {
        System.out.println("Enter a num :");
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();

        int reverse = 0, reminder = 0;
        while (num>0){
            reminder = num%10;
            num = num / 10;
            reverse = reverse * 10 +reminder;
        }
        System.out.println("Reverse : "+reverse);
    }
}


/*int rev=0, reminder=0;
        while(n>0) {
            reminder=n%10;
            n=n/10;
            rev=rev*10+reminder;
        }
        System.out.println("Reverse num is : "+rev);*/