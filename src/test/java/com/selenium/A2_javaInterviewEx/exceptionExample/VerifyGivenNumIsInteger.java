package com.selenium.A2_javaInterviewEx.exceptionExample;

import java.util.Scanner;

public class VerifyGivenNumIsInteger {
    public boolean verify_Int_Num(String var) {
        try {
            System.out.println(Integer.parseInt(var));
        } catch (VerifyGivenNumIsIntegerCustExp e) {
            throw new VerifyGivenNumIsIntegerCustExp("Number is not an integer");
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a num : ");
        String var = scn.nextLine();
        System.out.println(var.getClass());
        VerifyGivenNumIsInteger o = new VerifyGivenNumIsInteger();
        o.verify_Int_Num(var);

    }
}
