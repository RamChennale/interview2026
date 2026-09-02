package com.selenium.A2_javaInterviewEx.collectionsDataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertMapToListExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // 1. Convert Map Keys to a List
        List<Integer> keyList = new ArrayList<>(map.keySet());

        // 2. Convert Map Values to a List
        List<String> valueList = new ArrayList<>(map.values());

        // 3. Convert Map Entries (Key-Value Pairs) to a List
        List<Map.Entry<Integer, String>> entryList = new ArrayList<>(map.entrySet());

        System.out.println("Keys: " + keyList);      // [1, 2, 3]
        System.out.println("Values: " + valueList);  // [Apple, Banana, Orange]
    }
}
