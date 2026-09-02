package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindPairWithGivenSum {
    //Find a pair with a given sum (print all pairs)
    public static void findPairsWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }
}
