package com.selenium.A2_javaInterviewEx.Arrays;

public class SortArrayByNames {
    public static void main(String[] args) {

        String strArr[] = {"banana","grapes","apple"};

        String temp="";
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i+1; j <strArr.length ; j++) {
                if(strArr[i].compareTo(strArr[j])>0){
                    temp=strArr[i];
                    strArr[i]=strArr[j];
                    strArr[j]=temp;
                }
            }
        }

        System.out.println(strArr.toString());//[Ljava.lang.String;@49e4cb85
        for (String sortedNames:strArr) {
            System.out.println("the sorting array:" +sortedNames);
        }
    }
}
