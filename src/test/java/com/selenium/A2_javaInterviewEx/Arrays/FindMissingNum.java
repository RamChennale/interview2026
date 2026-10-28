package com.selenium.A2_javaInterviewEx.Arrays;


/*
* Step by step
java
    int expectedSum = n * (n + 1) / 2;   // sum of 1..n if nothing were missing
    int actualSum = 0;
    for (int num : arr) actualSum += num; // sum of what's really in the array
    return expectedSum - actualSum;       // the gap = missing number

    Correct usage example:

    n = 8, so the full set is 1..8, expectedSum = 8 × 9 / 2 = 36
    arr = {1, 2, 3, 5, 6, 7, 8} (4 is missing), actualSum = 32
    36 − 32 = 4;
* */


public class FindMissingNum {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 5, 6, 7, 8};  // 4 is missing
        int n = 8;                           // range is 1..8
        System.out.print("  : "+findMissingNumber(arr,n));
    }
    //Find the missing number in an array of 1..n
    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) actualSum += num;
        return expectedSum - actualSum;
    }
}
