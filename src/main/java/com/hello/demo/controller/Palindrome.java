package com.hello.demo.controller;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("hello world");
        String test = "A man, a plan, a canalPanama";
        System.out.println(isPalindrome(test));
        
    }
    public static boolean isValid(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }

    public static boolean isPalindrome(String s) {
        //Check if String empty or null
        if(s.length() == 0 || s == null) {
            return true;
        }

        int start = 0;
        int end = s.length() -1;
        while (start < end) {
            while(start < end && !isValid(s.charAt(start))){
                start++;
            }
            while (start < end && !isValid(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
