package com.selenium.A2_javaInterviewEx.numberMath;

public class Armstrongnum {

    public static void main(String[] args){

        int num = 153;
        int temp = num;
        int rem = 0;
        int sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println(temp + ": is armstrong num");
        }
        else {
            System.out.println(temp+ "is not armstrong num" + "");
        }
    }
    public void ArmstrongNum() {

    }

}
