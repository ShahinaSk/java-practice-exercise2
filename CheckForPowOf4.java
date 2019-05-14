package com.pe2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckForPowOf4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long number=Long.parseLong(br.readLine());
        System.out.println(checkIfPowOf4(number));
        br.close();
    }
    public static boolean checkIfPowOf4(long num){
        long rem=0;
       while(num!=1){
           if (num%4!=0){
               return false;
           }
           num=num/4;
       }
       if (num==1){
           return true;
       }
       return false;
    }
}
