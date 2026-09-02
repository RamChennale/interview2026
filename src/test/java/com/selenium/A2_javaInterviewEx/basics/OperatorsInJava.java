package com.selenium.A2_javaInterviewEx.basics;

//Operators are used to perform operations on variables and values.

public class OperatorsInJava {

    public static void main(String[] args){


        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.println(sum3);


        var m =13;
        var n =6;

        double c = m/n; //2
        double correctTypeCating = (double) m/n; // 2.8
        System.out.println(" Division :  " +c);


        //The addition assignment operator (+=) adds a value to a variable:
        int x = 10;
        x += 5;
        System.out.println(x);
/*

                Operator	Example	Same As	Try it
                =	x = 5	x = 5
                +=	x += 3	x = x + 3
                -=	x -= 3	x = x - 3
                *=	x *= 3	x = x * 3
                /=	x /= 3	x = x / 3
                %=	x %= 3	x = x % 3
                &=	x &= 3	x = x & 3
                |=	x |= 3	x = x | 3
                ^=	x ^= 3	x = x ^ 3
                >>=	x >>= 3	x = x >> 3
                <<=	x <<= 3	x = x << 3
            */
/*
        A list of all comparison operators:

        Operator	Name	Example	Try it
                ==	Equal to	x == y
                !=	Not equal	x != y
                >	Greater than	x > y
                <	Less than	x < y
                >=	Greater than or equal to	x >= y
                <=	Less than or equal to	x <= y

      */
/*
        Logical operators are used to determine the logic between variables or values, by combining multiple conditions::

                Operator	Name	Description	Example	Try it
                && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
                || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
                !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)*/


        boolean status = false;
        if (!status){
            System.out.println("executed when !true, ie when it's false");
        }

/*
Java Operator Precedence
When a calculation contains more than one operator,
Java follows order of operations rules to decide which part to calculate first.


        Order of Operations
        Here are some common operators, from highest to lowest priority:

                () - Parentheses
                *, /, % - Multiplication, Division, Modulus
                +, - - Addition, Subtraction
                >, <, >=, <= - Comparison
                ==, != - Equality
                && - Logical AND
                || - Logical OR
                = - Assignment

        */
    }
}
