package com.selenium.A2_javaInterviewEx.basics;

public class Loops {

    public static void main(String[] args) {

        int count = 10;
        while (count > 0){
            System.out.println(" Count : "+ count);
            count--;
        }
do {
    System.out.println(" Do while Count : "+ count);
    count++;
}while(count<5);


       System.out.println("FOR  looooooooooop");

       for(int i=0; i<=5; i++){
           System.out.println(" Value of \"i\" in FOR loop : "+i);
       }

       for(int i=1; i<=2; i++){
           System.out.println(" Value of \"i\" in nested FOR loop : "+i);

           for(int j=1; j<=3; j++){
               System.out.println(" Value of \"j\" in nested FOR loop : "+j);
           }
       }

    System.out.println(" ------------------------------ ");
        int n=10;
       for (int i =0; i<n; i=i+2){
           System.out.println("EVEN num "+i);
       }
/*
        for-each Loop
        There is also a "for-each" loop,
            which is used exclusively to loop through elements in an array (or other data structures):

       */

        int[] array = {1,2,3,4,5,6};
        for(int i:array){
            System.out.println("Fo each : "+i);
        }

        String[] names = {"Ram","Nidhi", "Diksha"};
        for(String name:names){
            System.out.println("Fo each : "+name);
        }


        for(int i=1; i<5; i++){
            System.out.println("Fo each : with BREAKE "+i);
            if(i==3){
                System.out.println("Fo each : braked i==3");
                break;
            }
        }

        for (int i=1; i<=5; i++){
            if(i==3)
                continue;
            System.out.println("Fo each : Continue=3 : " +i);
        }














    }
}

