package com.selenium.A2_javaInterviewEx.collectionsDataStructure.listEx;
/*
Method	Description	Try it
        addFirst()	Adds an element to the beginning of the list
        addLast()	Add an element to the end of the list
        removeFirst()	Remove an element from the beginning of the list
        removeLast()	Remove an element from the end of the list
        getFirst()	Get the element at the beginning of the list
        getLast()	Get the element at the end of the list

        */


import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.addFirst("AAA");
        System.out.println(cars.getFirst());


        Collections.sort(cars);
    }
}