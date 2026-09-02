package com.selenium.A2_javaInterviewEx.collectionsDataStructure;


/*
        | Aspect 				| HashMap 		| LinkedHashMap 	| TreeMap 		| Hashtable 						| ConcurrentHashMap 			 	|
        |---					|---	  		|---				|---			|---								|---								|
        | Order					| No guarantee 	| Insertion order 	| Sorted by key | No guarantee 						| No guarantee					    |
        | Thread-safe 			| No 			| No 				| No 			| Yes (fully synchronized, slow) 	| Yes (segment/bucket-level locking, fast) |
        | Null key/values 		| 1null:M null val| Same as HashMap | No null key 	| No nulls allowed at all 			| No nulls allowed 					|
        | Performance 			| O(1) average | O(1) average 		| O(log n)		| O(1) but slow (lock on every op)  | O(1) average, better concurrency 	|
*/


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapHashMap_TestConfig {

    public static void main(String[] args){

        Map<Integer, String> getDriverName = new HashMap();
        getDriverName.put(1,"QA Engr");

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("browser", "Chrome");
        hashMap.put("env", "QA");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("step1", "Login");
        linkedHashMap.put("step2", "Search"); // maintains insertion order — useful for ordered test steps

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 1); treeMap.put("Apple", 2);
        System.out.println(treeMap); // {Apple=2, Zebra=1} — sorted by key

    }

}
