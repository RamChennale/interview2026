package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.Arrays;

public class ArraysEx1 {

    public static void main(String[] args){

        String[] cars;
        cars = new String[]{"MARUTI", "TATA"};
        System.out.println(cars[1]);
        System.out.println("cars.length : "+ cars.length);
        
        for (String array:cars){
            System.out.println(array);
        }
        
        String[] strings = new String[2];
        strings[0] = "a";
        strings[1] = "b";

        String[] cars1 = {"a","b","c"};

        String[] cars2 = new String[] {"a","b","c"};

        for (String s : cars2){
            System.out.println(" traversing array : "+ s);
        }

        for (int i =0 ; i<cars2.length; i++){
            System.out.println(cars2[i]);
        }

        int[] array2 = new int[4];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;

        for (int i=0; i<array2.length; i++){
            System.out.println(array2[i]);
        }

        try{
            System.out.println(array2[10]);
        }catch(ArrayIndexOutOfBoundsException aeoobe){
            aeoobe.printStackTrace();
            System.out.println(aeoobe.getMessage());
        }


        int array1[] = {1,2,3,4,5,6,7};
        int sum= 0;
        for (int i=0; i<array1.length; i++){
            sum += array1[i];
        }
        System.out.println("Sum of the array : "+sum);
        System.out.println("Aaar length : " +array1.length);

        System.out.println("array1.toString() : " +array1.toString());

        System.out.println("Arrays.stream(array1).sum()" + Arrays.stream(array1).sum());

        System.out.println("Arrays.stream(array1).average()  -- >  " + Arrays.stream(array1).average());
        System.out.println("Arrays.stream(array1).min()       -- > " + Arrays.stream(array1).min().toString());
        System.out.println("Arrays.stream(array1).max()       -- >  " + Arrays.stream(array1).max());
        System.out.println("Arrays.stream(array1).toString()  -- >  " + Arrays.stream(array1).toString());
        System.out.println("Arrays.stream(array1).count()  -- >  " + Arrays.stream(array1).count());
        System.out.println("Arrays.stream(array1).findFirst()  -- >  " + Arrays.stream(array1).findFirst());
        System.out.println("Arrays.stream(array1).iterator()   -- >  " + Arrays.stream(array1).iterator());

        System.out.println("Arrays.stream(array1).distinct()   -- >  " + Arrays.stream(array1).distinct());
        System.out.println("Arrays.stream(array1).sorted()   -- >  " + Arrays.stream(array1).sorted());

        System.out.println("Avg of the array : "+sum/array1.length);


    }
}
