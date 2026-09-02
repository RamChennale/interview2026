package com.selenium.A2_javaInterviewEx.collectionsDataStructure;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
public class RemoveDuplicatesInArraylist {


        public static void main(String[] args) {
            List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange", "banana"));

            // 1. Pass the list to a LinkedHashSet to strip duplicates and keep order
            LinkedHashSet<String> set = new LinkedHashSet<>(list);

            // 2. Clear the original list
            list.clear();

            // 3. Add the unique elements back
            list.addAll(set);

            System.out.println(list); // Output: [apple, banana, orange]
        }
    }
