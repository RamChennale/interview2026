package com.selenium.A2_javaInterviewEx.collectionsDataStructure.iterable_In;

import java.util.*;

public class A2_Queue_Inteface {

    public static void main(String[] args) {
            }

    public static void Queuetest(){
        Queue<String> queue = new LinkedList<>();

        queue.add("Rahul");
        queue.add("Priya");
        queue.add("Amit");

        System.out.println(queue.poll());

    } public static void PriorityQueuetest(){
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Alice");
        queue.add("Daniel");
        queue.add("Jones");
        queue.add("Smith");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }


    public static void Dequetest(){
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Rahul");
        deque.addLast("Priya");

        System.out.println(deque);
    }

    public static void DequeArrayDequetest(){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Lucy");
        deque.add("Andrew");
        deque.add("Henery");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
