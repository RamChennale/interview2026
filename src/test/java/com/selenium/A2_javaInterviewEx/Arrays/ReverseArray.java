package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){
        int[] originalarray={1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(originalarray) + "Reversed array: "+reversedArray(originalarray));

    }

    public static  String reversedArray(int[] array){
        int left =0, right=array.length-1, temp=0;
        while (left<right){
            temp = array[left];
            array[left] = array[right];
            array[right] = array[temp];
             left++;
             right--;
        }
        return Arrays.toString(array);
    }
}
