package com.selenium.A2_javaInterviewEx.collectionsDataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class
CollectionsClass {

    public static void main(String[] args){

        /*`Collections.sort()`, `Collections.reverse()`, `Collections.unmodifiableList()`, `Collections.synchronizedList()`,
`Collections.max()/min()`, `Collections.emptyList()`.
*/

        List<String> tests = new ArrayList<>(List.of("TC3","TC1","TC2"));
        Collections.sort(tests);                          // natural order sort
        List<String> readOnly = Collections.unmodifiableList(tests); // prevents accidental mutation of shared test data


    }
}
