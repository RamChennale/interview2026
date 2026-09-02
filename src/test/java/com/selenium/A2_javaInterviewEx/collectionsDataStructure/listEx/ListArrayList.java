package com.selenium.A2_javaInterviewEx.collectionsDataStructure.listEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListArrayList {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("Ram");
        list.add("3.2");
        list.add("1");
        list.add("Ram");

        Iterator<String> iterator = list.iterator();

        while ((iterator.hasNext())){
            System.out.println("ArrayList by Iterator :   -----> "+iterator.next());
            iterator.remove();
        }


        ListIterator<String>  stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()){
            System.out.println("Traversing Array list by stringListIterator :   -----> "+stringListIterator.next());
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int i=0; i<10; i++){
            arrayList.add(i);
        }

        ListIterator<Integer> integerListIterator =  arrayList.listIterator();
        while (integerListIterator.hasNext()){
            System.out.println("Traversing integerListIterator in ArrayList  ----->" + integerListIterator.next());
        }


    }
}
