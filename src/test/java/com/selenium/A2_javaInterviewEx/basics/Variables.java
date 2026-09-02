package com.selenium.A2_javaInterviewEx.basics;

public class Variables {
    public static void main(String[] args){
        int age = 22;

        String name = "Ram";

        byte bt = 12;
        short st = 123;
        int it = 12345;
        long lg = 21345678;

        float ft = 12.12f;
        double db = 123.123d;

        boolean pass = true;
        boolean fail = false;

        char single= 'R';
        //char one = "C"; // ERROR
        char one = 'C';

        String mulChar = "Rc";
        String name1 = "Chennale";

        System.out.println(bt+ "" +st+ "" + it+ "" + lg);

        System.out.println("float"+ft);
        System.out.println("double"+db);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';


// Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);

    }
}
