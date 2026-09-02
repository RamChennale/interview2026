package com.selenium.A2_javaInterviewEx.collectionsDataStructure.Map_Ex;

import java.util.HashMap;
import java.util.Map;

public class AA_Map_SortedMap_Interfaces {

    public static void main(String[] args) {

    }


    public static void MapHashMaptest(){
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Rahul");
        map.put(2, "Priya");
        map.put(3, "Amit");

        System.out.println(map);
    }



    public static void HashMaptest(){
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();
        // Adding key-value pairs to the HashMap
        map.put("Alice", 10);
        map.put("Bob", 20);
        map.put("Charlie", 30);
        // Retrieving a value
        System.out.println("Value for 'Alice': " + map.get("Alice"));
        // Iterating over key-value pairs
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        // Removing a key-value pair
        map.remove("Charlie");
        // Checking the presence of a key
        if (map.containsKey("Bob")) {
            System.out.println("Map contains key 'Bob'.");
        }
    }



}
