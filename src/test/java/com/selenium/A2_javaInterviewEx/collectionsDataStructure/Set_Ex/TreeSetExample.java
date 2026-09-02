package com.selenium.A2_javaInterviewEx.collectionsDataStructure.Set_Ex;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);

        Collections.reverseOrder();
    }
}
