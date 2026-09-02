package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueNumArray {
    public static void main(String[] args){

        int[] num= {1,2,3,4,5,1,2,3};

        Set<Integer> isUnique = new HashSet<>();
        List<Integer> dup = new ArrayList<>();

        for(int i:num){
            if(isUnique.add(i)){
                dup.add(i);
            }
        }
        System.out.println("Dup num : "+isUnique);
    }
}

/* Output
 * Dup num : [1, 2, 3]
 * */
