package com.selenium.A2_javaInterviewEx.basics;

/*
Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created.

All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
*/



public class ConstructorsInJava {

    int x;
    ConstructorsInJava(int y){
        x= y;
        System.out.println(x);
    }

    public static void main(String[] args){
        ConstructorsInJava constructorsInJava = new ConstructorsInJava(2);

       System.out.println(constructorsInJava.x);
    }
}
