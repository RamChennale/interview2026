package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.*;

public class IntersectionTwoArrays_COMMON {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 22, 34, 55,9, 5};
        int[] arr2 = {1, 2, 3, 4};

        System.out.println("intersection or COMMON num  : "+intersection(arr1,arr2));

        System.out.println("intersection or COMMON num  : "+intersection1(arr1,arr2));

    }

    public static Set intersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : arr1){
            set1.add(n);
        }
        Set<Integer> result = new LinkedHashSet<>();
        for (int n : arr2) {
            if (set1.contains(n)) result.add(n);
        }
        return result;
    }

    // Changed return type to Set<Integer>
    public static Set<Integer> intersection1(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Load both arrays into sets
        for (int n : arr1) set1.add(n);
        for (int n : arr2) set2.add(n);

        // retainAll keeps ONLY the elements that exist in both sets
        set1.retainAll(set2);

        return set1;
    }


}
