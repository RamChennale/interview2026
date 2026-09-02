package com.selenium.A2_javaInterviewEx.strings;

public class StringCompare {

    public static void main(String[] args){

        String string = "Hello Ram";
        String string1 = "Hello Ram    ";
        String string2 = "Hello Ram";
        String string3 = new String("Hello Ram");

        System.out.println(string+ " "+string1 +"  : "+string.equalsIgnoreCase(string1));

        System.out.println(string  + " string.trim() : "+string.trim());

        System.out.println("string2 hashCode(): "+string2.hashCode()  + " string3  hashCode():"+string3.hashCode());

        System.out.println(string + "string_indexOf()"+string.indexOf("Ram"));

        System.out.println(string.contains("Ram"));

        System.out.println(string.toString().toString().toLowerCase());

        System.out.println(string.charAt(1));

        char[] strArray = string.toCharArray();
        System.out.println(strArray + " "+strArray.toString());

        for (char ch:string.toCharArray())
            System.out.println(ch);


        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
/*

        Escape character	Result	Description
        \'	'	Single quote
        \"	"	Double quote
        \\	\	Backslash

*/

        System.out.println("Ram's sir name is : \"chennale\" from kalwadi");


        System.out.println("Ram's sir name is : \'chennale\' from kalwadi");


        System.out.println("Ram's sir name is : \"chennale\" from kalwadi home ch\\5" );


        System.out.println(string);



    }
}
