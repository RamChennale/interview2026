package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.Arrays;

public class secondLargest {

    public static void main(String[] args) {
        int[] originArray = {1, 2, 3, 4, 22, 34, 55, 5};

        System.out.println("Second Largest num : " + secondLargest(originArray));

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
        return second;
    }
}
