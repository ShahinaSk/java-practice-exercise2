package com.pe2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EvenNumTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        System.out.println(isEven(input));
        br.close();
    }

    public static boolean isEven(int number){
        return (number%2==0);
    }
}
