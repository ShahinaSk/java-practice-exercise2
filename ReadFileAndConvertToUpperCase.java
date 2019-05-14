package com.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ReadFileAndConvertToUpperCase {
    public static void main(String[] args) throws Exception {
        BufferedReader br=null;
        br=new BufferedReader(new InputStreamReader(System.in));
        File file=new File(br.readLine());
        br=new BufferedReader(new FileReader(file));
        String string="";
        while ((string=br.readLine())!=null){
            System.out.println(string.toUpperCase());
        }
        System.out.println("\nLength Of the file is: "+file.length());
    }
}
