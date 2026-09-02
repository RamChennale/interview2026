package com.selenium.A2_javaInterviewEx.numberMath;

import java.util.Scanner;

public class PrimeNum {


    public static boolean isPrime(int num){
        if(num<=1) {
            System.out.println(num + " - is not a prime num.");
        return false;
        }
        for (int i=2; i<num; i++){
            if(num % i == 0){
                System.out.println(num + " - is not a prime num.");
                return false;
            }
        }
        System.out.println(STR."\{num} - is a prime num.");
        return true;
    }


    public static void main(String[] args) {

        System.out.println("Enter a num ?");
        Scanner scanner= new Scanner(System.in);
        int i= scanner.nextInt();
        isPrime(i);
        //System.out.println(isPrime(i)?+i+" is the prime num":+i+" is not prime num");

    }

}
