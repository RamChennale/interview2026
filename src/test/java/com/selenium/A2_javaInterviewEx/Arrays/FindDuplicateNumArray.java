package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.*;

public class FindDuplicateNumArray {
    public static void main(String[] args){

        /*int[] num= {1,2,3,4,5,1,2,3};
        //int[] num1={3,3,4,4,5,3};

        Set<Integer> isExist = new HashSet<>();
        List<Integer> dup = new ArrayList<>();

        for(int i:num){
            if(!isExist.add(i)){
                dup.add(i);
            }
        }
        System.out.println("Dup num : "+dup);*/


        int[] arr={1,2,1,2,3,4,4,5};

        Set<Integer> isExist= new HashSet<>();
        List<Integer> dup = new ArrayList<>();

        for(int num:arr){
            if(!isExist.add(num)){
                dup.add(num);
            }
        }
        System.out.println(" Original arra : "+ Arrays.toString(arr));

        System.out.println("Duplicates  : "+dup);

        System.out.println("Uniqu : "+isExist);

    }



}

/* Output
* Dup num : [1, 2, 3]
* */