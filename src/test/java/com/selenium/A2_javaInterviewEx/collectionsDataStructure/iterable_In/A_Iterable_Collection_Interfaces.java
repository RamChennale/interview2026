package com.selenium.A2_javaInterviewEx.collectionsDataStructure.iterable_In;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A_Iterable_Collection_Interfaces {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");

        for (String name : list) {
            System.out.println(name);
        }




        Iterator<String> itr = list.iterator();
        // Iterable Interface It contains only one abstract method. Iterator<T> iterator()
        while (itr.hasNext()) {
            System.out.println(" Iterator : " +itr.next());
        }
    }
}
