package com.selenium.A2_javaInterviewEx.Arrays;

public class MoveZerosEndPreservingNon_zeros {
    //Move all zeros to the end while preserving order of non-zeros
    public static void moveZerosToEnd(int[] arr) {
        int insertPos = 0;
        for (int num : arr) {
            if (num != 0) arr[insertPos++] = num;
        }
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }
}
