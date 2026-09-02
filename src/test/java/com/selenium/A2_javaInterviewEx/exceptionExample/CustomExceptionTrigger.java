package com.selenium.A2_javaInterviewEx.exceptionExample;

public class CustomExceptionTrigger {

    public static void main(String[] args)  {

        CustomExceptionTrigger obj = new CustomExceptionTrigger();
        int n1=5, n2=0,result = 0;
        try {
            obj.division(n1,n2,result);
        }catch (CustomException e){
             System.out.println("Trying to divide by ZERO : "+e.getMessage());
        }
      System.out.println("Div of 2 num : is n1:"+n1 + " :s"+ n2);
    }

    public int division(int n1, int n2, int result) throws CustomException {
         result = n1/n2;
        throw new CustomException("Num can not divide / by zero CustomException message TRIGGERED",result);
    }
}
