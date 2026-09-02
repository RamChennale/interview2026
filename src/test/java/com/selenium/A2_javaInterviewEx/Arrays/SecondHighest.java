package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {

        int[] arr = {34,56,999,66};
        System.out.println("Second Highest: "+secondLargest(arr));// 34 print value

        Arrays.sort(arr);
        System.out.println(" array lent " +arr.length);//3 its prints index number
        System.out.println(arr.length-2);//3 its prints index number
        System.out.println(arr.length-2);//3 its prints index number// .
        System.out.println("Second Highest:"+arr[(arr.length - 2)]);
    }

    public static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        System.out.println(""+second);
        return second;
    }
}
