package com.selenium.A2_javaInterviewEx;

import io.cucumber.java.sl.In;

import java.util.*;

public class Testing {



    public static void main(String[] args) {
        dupNumInArray();
    }


/*    Arrays programs */

public static void dupNumInArray(){
    int[] arr1={1,2,3,4,5,1,2,3,6};

    Set<Integer> exist = new HashSet<>();
    List<Integer> dupNumList = new ArrayList<>();

    for(int num:arr1){
        if (!exist.add(num)){
            dupNumList.add(num);
        }
    }
    System.out.print(dupNumList + ",");
}

public  static void dupNumTwoInArray(){
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = new int[3];
        //int[] arr2 = {2,4,6};
        arr2[0] = 2;
        arr2[1] = 4;
        arr2[2] = 6;
    List<Integer> dupList = new ArrayList<>();

    for(int i=0; i<arr1.length; i++){
            for (int j=0; j<arr2.length ; j++){
                if (arr1[i] == arr2[j]){
                    dupList.add(arr1[i]);
                }
            }
        }
    System.out.println(dupList);
}


    public static void printArray(){
        String[] strings = new String[]{"aaa","bbbb","cccc"};
        int[] ints={1,2,3,4,5};

        System.out.println("Array length {1,2,3,4,5} ******"+ints.length); //5
        System.out.println("Num length [0] ******"+ints[0]); //1
        System.out.println("Num length [4] ******"+ints[4]); //5
        for (int i:ints){
            System.out.print(i+" , ");
        }
        System.out.println("String Array length {\"aaa\",\"bbbb\",\"cccc\"} ****** "+strings.length );
        System.out.println("String length [0] ******"+strings[0] );
        for (String string:strings){
            System.out.print(string + " , ");
        }

    }

    public void reverseArray(){
      /*  int[] ints={1,2,3,4,5};*/
        String[] ints = {"aa","bb","cc","dd"};
        System.out.print("Orginal Array  "+ Arrays.toString(ints));

        for (int i=ints.length-1; i>=0; i--){
            System.out.print(ints[i]+",");
        }
    }

    public static void sum(){
        int [] array1 = {1,2,3,4,5};
        System.out.print("original Array : ");
        for (int i: array1){
            System.out.print(i +",");
        }

        int sum=0;
            for (int i=0; i<array1.length-1;i++){
                sum = sum+array1[i];
            }
        System.out.print(" sum of array : "+sum);

    }




}
