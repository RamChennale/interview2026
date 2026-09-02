package com.selenium.A2_javaInterviewEx.Arrays;

public class FindMissingNum_whisIT {

/*
    public static void main(String[] args){

        int[] arr={1,2,3,4,5,6,7,8};
        int n=2;
        System.out.println("  : "+findMissingNumber(arr,n));
    }*/
    //Find the missing number in an array of 1..n
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
}
