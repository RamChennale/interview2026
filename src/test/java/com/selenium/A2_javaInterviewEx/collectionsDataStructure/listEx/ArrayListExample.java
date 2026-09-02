package com.selenium.A2_javaInterviewEx.collectionsDataStructure.listEx;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.set(0,"Ram");
        System.out.println("Afte rupdate : "+cars.get(0));
        Collections.sort(cars);

    for(String string:cars){
        System.out.println(string);
        }
    }

}
