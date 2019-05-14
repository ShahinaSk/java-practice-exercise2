package com.pe2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseInputAndCheckForPalindrome {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String string=br.readLine();
        revAndCheckPalindrome(string);
        br.close();
    }
    public static void revAndCheckPalindrome(String string){
        String reverse=new StringBuffer(string).reverse().toString();
        System.out.println("Reverse of "+string+" is "+reverse);
        System.out.println((string.equalsIgnoreCase(reverse))?(string+" is Palindrome"):(string+" is not a Palindrome"));

    }
}
