package com.selenium.A2_javaInterviewEx.Arrays;

import java.util.Arrays;

public class PrintArray {

    public static void main(String[] args){
        int[] originalarray={1,2,3,4,5,6,7};
        String[] name={"Ram", "sachin", "pillu"};

        String name1 = Arrays.toString(name);
        String num = Arrays.toString(originalarray);

        System.out.println("string of Array as String  "+name1 );


        System.out.println( "Num: in string format: "+num);

    }

}


