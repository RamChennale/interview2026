package com.selenium.A2_javaInterviewEx.collectionsDataStructure.iterable_In;

import java.util.*;

public class A1_List_Inteface {

    public static void main(String[] args) {

    }

    public static void listArrayList(){
        List<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");

        System.out.println(list);
    }

    public static void arrayListArrayList(){
        ArrayList<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");

        System.out.println(list.get(1));
    }

    public static void linkedListLinkedList(){
        LinkedList<String> al=new LinkedList<String>();
        al.add("Lucy");
        al.add("Peter");
        al.add("Lucy");
        al.add("John");
        Iterator<String> itr=al.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void Vectortest(){
        Vector<String> v=new Vector<String>();
        v.add("Apple");
        v.add("Banana");
        v.add("Orange");
        v.add("Plum");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void Stacktest(){
        Stack<String> stack = new Stack<String>();
        stack.push("CPU");
        stack.push("Monitor");
        stack.push("Mouse");
        stack.push("Keyboard");
        stack.push("Printer");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
