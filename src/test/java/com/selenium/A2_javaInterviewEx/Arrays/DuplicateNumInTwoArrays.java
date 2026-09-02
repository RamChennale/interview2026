package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumInTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 22, 34, 55,9, 5};
        int[] arr2 = {1, 2, 3, 4};
        Set<Integer> unique = new HashSet<>();
        List<Integer> COMMON = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    COMMON.add(arr2[j]);
                }
            }
        }
        System.out.println("COMMON : "+COMMON);

    }
}
