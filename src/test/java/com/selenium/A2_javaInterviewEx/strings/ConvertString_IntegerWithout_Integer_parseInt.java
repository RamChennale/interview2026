package com.selenium.A2_javaInterviewEx.strings;

public class ConvertString_IntegerWithout_Integer_parseInt {
    //Convert a string to an integer without Integer.parseInt() (atoi)
    public static int stringToInt(String str) {
        str = str.trim();
        int sign = 1, index = 0, result = 0;
        if (str.charAt(0) == '-' || str.charAt(0) == '+') {
            sign = str.charAt(0) == '-' ? -1 : 1;
            index++;
        }
        while (index < str.length() && Character.isDigit(str.charAt(index))) {
            result = result * 10 + (str.charAt(index) - '0');
            index++;
        }
        return result * sign;
    }
}
