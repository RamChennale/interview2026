package com.selenium.A2_javaInterviewEx.strings;

public class Test {

        public static String reverseWithSpaces(String input) {
            char[] arr = input.toCharArray();
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                // Skip spaces on the left side
                if (arr[left] == ' ') {
                    left++;
                }
                // Skip spaces on the right side
                else if (arr[right] == ' ') {
                    right--;
                }
                // When both are non-space characters, swap them
                else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            }
            return new String(arr);
        }

        public static void main(String[] args) {
            String original = "Not String";
            String result = reverseWithSpaces(original);

            System.out.println("Original: " + original);
            System.out.println("Reversed: " + result);
            // Output: g ni rtS toNmAI
        }
    }

