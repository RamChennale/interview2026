package com.selenium.A2_javaInterviewEx.collectionsDataStructure.algorithms;

import java.util.ArrayList;
import java.util.Collections;

/*

#Algorithms

Useful Algorithms
The Collections class contains many more algorithms, such as:

        Collections.max() - find the largest element
Collections.min() - find the smallest element
Collections.shuffle() - randomly shuffle elements
Collections.frequency() - count how many times an element appears
Collections.swap() - swap two elements in a list
In this example, we use Collections.max() and Collections.min() to find the largest and smallest element in an ArrayList:



*/

public class BinarySearchExample {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names); // must be sorted first
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);

        //Randomly shuffle an ArrayList:

        Collections.shuffle(names);
        System.out.println(names);

   //SORTING

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers);
        System.out.println(numbers); // [1, 3, 5, 7, 9]

        //SORT IN REVERS
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers); // [9, 7, 5, 3, 1]


        //MAX AND MIN
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

//Collections.frequency() counts how many times an element appears in a list:

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");


        //Collections.swap() swaps two elements in a list:

        Collections.swap(fruits, 0, 2); // Swap first and third element
        System.out.println(fruits);

        /*Summary
        An algorithm is a procedure to solve a problem.
                Java provides built-in algorithms in the Collections class.
        Common algorithms include searching, sorting, iterating, and finding min/max.
                Algorithms work together with data structures (like ArrayList, HashSet, etc.) to make your programs more powerful and efficient.
        */

    }

 }
