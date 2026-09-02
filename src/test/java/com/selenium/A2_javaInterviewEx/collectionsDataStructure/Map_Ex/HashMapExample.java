package com.selenium.A2_javaInterviewEx.collectionsDataStructure.Map_Ex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args){

        HashMap<String, String>  hashMap = new HashMap<>();

        hashMap.put("DHL", "IND");
        hashMap.put("WTN","USA");
        hashMap.put("SHANG","CHINA");
        hashMap.put("ISM","PAK");
        hashMap.put("DHL", "INDIA"); // due duplicate key, value is overridden
        System.out.println(hashMap);

        System.out.println(hashMap.get("DHL"));
        System.out.println(hashMap.getOrDefault("DHL",""));

/*        hashMap.get  ->null
        hashMap.getOrDefault   ->
                */
        System.out.println("hashMap.get  ->"+hashMap.get("11"));
        System.out.println("hashMap.getOrDefault   -> " + hashMap.getOrDefault("222",""));


        //get KEYS
        for(String keys:hashMap.keySet()){
            System.out.println(" Keys : ->" + keys);
        }

        //get VALES
        for(String values:hashMap.values()){
            System.out.println("Values : ->"+values);
        }

        //get K&V
        for(String keys:hashMap.keySet()){
            System.out.println("Keys : "+keys + " Val: "+hashMap.get(keys));
        }

        // Create a HashMap object called people
        //Map<String, Integer> -> == var java 10 feature
        //Map<String, Integer> people = new HashMap<String, Integer>();

        var people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


    }
}
