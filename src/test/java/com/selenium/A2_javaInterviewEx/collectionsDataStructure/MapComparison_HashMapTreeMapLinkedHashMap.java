package com.selenium.A2_javaInterviewEx.collectionsDataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison_HashMapTreeMapLinkedHashMap {
    public static void main(String[] args) {

        // 1. HashMap: Output order is unpredictable
        Map<String, Integer> hashMap = new HashMap<>();
        populateMap(hashMap);
        System.out.println("HashMap (Unordered):       " + hashMap);

        // 2. LinkedHashMap: Output order matches insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        populateMap(linkedHashMap);
        System.out.println("LinkedHashMap (Insertion): " + linkedHashMap);

        // 3. TreeMap: Output order is sorted alphabetically by key
        Map<String, Integer> treeMap = new TreeMap<>();
        populateMap(treeMap);
        System.out.println("TreeMap (Sorted Keys):     " + treeMap);
    }

    private static void populateMap(Map<String, Integer> map) {
        map.put("Banana", 3);
        map.put("Apple", 5);
        map.put("Orange", 2);
        map.put("Mango", 7);
    }
}
