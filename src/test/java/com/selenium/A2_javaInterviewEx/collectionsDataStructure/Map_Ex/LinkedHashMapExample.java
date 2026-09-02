package com.selenium.A2_javaInterviewEx.collectionsDataStructure.Map_Ex;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("India"));
        System.out.println("WRONG KEY "+capitalCities.get("Ind")); // o/p -> null
        System.out.println("SIZE "+capitalCities.size());

        System.out.println(capitalCities);
    }

}
/*

Output: The items will appear in the order they were added (e.g., {England=London, India=New Dehli, Austria=Wien, Norway=Oslo, USA=Washington DC}).

Note: Duplicates like "Norway" are ignored.

*/
