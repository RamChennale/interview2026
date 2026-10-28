package com.selenium.A2_javaInterviewEx.Arrays;

/*  lexicographical order

lexicographical : means arranged in a way that follows the standard alphabetical order of a dictionary
Params:
anotherString – the String to be compared.

Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings.
The character sequence represented by this String object is compared lexicographically to the character sequence represented by the argument string.

Example:
        String[] strings1={"String1"};
        strings1[1].compareTo("String2");

 Explaining compareTo and the if condition
**********************************************
What compareTo does

s1.compareTo(s2) compares two strings character by character, using each character’s Unicode (ASCII) value. It returns:

Result	Meaning
negative (< 0)	s1 comes before s2
0	both strings are equal
positive (> 0)	s1 comes after s2

For example, "AA".compareTo("BB") gives -1 because 'A' (65) is less than 'B' (66).

This reads: “if the element at i is alphabetically smaller than the element at j, swap them.” The swap uses temp as a third variable so neither value is lost.

Trace through your array

Using ranks AA=1, BB=2, VV=3, dd=4, the array starts as [dd, AA, VV, BB] = [4, 1, 3, 2]:

i=0: 4 is never less than anything, so there are no swaps. [4,1,3,2]
i=1: 1 < 4, swap. [1,4,3,2]
i=2: 3 < 4, swap. [1,3,4,2]
i=3: 2 < 3, swap, then 3 < 4, swap. [1,2,3,4]

* */
public class SortArrayInAlphabeticalOrder {
    public static void main(String[] args) {

        sortAlphabeticalOrder();
    }

    public static void sortAlphabeticalOrder(){
        String stringArray[] = {"dd","AA","VV","BB"}; // output - ,AA,BB,dd,VV
        String temp = "";
        for(int i=0; i<stringArray.length;i++){
            for(int j=0; j<stringArray.length;j++){
                if(stringArray[i].compareToIgnoreCase(stringArray[j])<0){
                    temp = stringArray[i];
                    stringArray[i]= stringArray[j];
                    stringArray[j]= temp;
                }
            }
        }
        System.out.println("the sorting string array in reverse order :");
        for (String sortedString:stringArray){
            System.out.print(","+sortedString);
        }
    }

    public static void SortReverseAlphabeticalOrder(){
            String stringArray[] = {"dd","AA","VV","BB"}; // output - ,VV,dd,BB,AA
            String temp = "";
            for(int i=0; i<stringArray.length;i++){
                for(int j=0; j<stringArray.length;j++){
                    if(stringArray[i].compareToIgnoreCase(stringArray[j])>0){
                        temp = stringArray[i];
                        stringArray[i]= stringArray[j];
                        stringArray[j]= temp;
                    }
                }
        }
        System.out.println("the sorting string array in reverse order :");
            for (String sortedString:stringArray){
                System.out.print(","+sortedString);
            }

    }


}
