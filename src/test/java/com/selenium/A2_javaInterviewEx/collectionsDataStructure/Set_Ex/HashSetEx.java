package com.selenium.A2_javaInterviewEx.collectionsDataStructure.Set_Ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args){

        int[] m={1,2,3,4,5,6,7};
        String [] n = {"a", "b", "c", "d", "c"};

        for (int i:m){
            System.out.println("Original int array :  "+i);
        }

        for (String string:n){
            System.out.println("Original string array :  "+string);
        }

        HashSet<Integer> integerHashSet = new HashSet<>();
           integerHashSet.add(1);
           integerHashSet.add(2);
           integerHashSet.add(3);
           for(int i:m){
                integerHashSet.add(i);
           }

           integerHashSet.contains(1);
           integerHashSet.isEmpty();
           integerHashSet.remove(2);
           integerHashSet.size();
//           integerHashSet.clear();

        System.out.println("Print integerHashSet :  "+integerHashSet );

        Iterator<Integer> streamIterator =  integerHashSet.stream().iterator();
        while (streamIterator.hasNext()){
            System.out.println("integerHashSet.stream().iterator()   : --> "+streamIterator.next());
        }

        Iterator<Integer> integerIterator=     integerHashSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println("integerIterator : ->"+integerIterator.next());
        }

        Set<String> stringSet = new HashSet<>();
          stringSet.add("a");
          stringSet.add("b");
          for (String string: n){
              stringSet.add(string);
          }
          System.out.println("Print StringSet : "+stringSet );


        stringSet.iterator(); //- retunrs TRUE if set has items - then loops will get in infinite circular if try to access directly without .next method
         /*
         Iterator<String> stringIterator=  stringSet.iterator();
          while (stringIterator.hasNext()){
                System.out.println("stringIterator : --->"+ stringIterator);
            }*/

        Iterator<String> stringIterator=  stringSet.stream().iterator();
        while (stringIterator.hasNext()){
            System.out.println("stringIterator : --->"+ stringIterator.next());
        }


    }

}
