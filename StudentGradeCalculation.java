package com.pe2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentGradeCalculation {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of students: ");
        int noOfStudents=Integer.parseInt(br.readLine());
        int[] grades=new int[noOfStudents];
        int index=0;
        while(index<noOfStudents){
            System.out.println("Enter the grade for student "+(index+1)+": ");
            grades[index]=Integer.parseInt(br.readLine());
            if (!validGrade(grades[index])){
                System.out.println("Enter valid marks between 1-100");
                return;
            }
            index++;
        }
        System.out.println("The average is "+findAvg(grades)+"\n");
        Arrays.sort(grades);
        System.out.println("The minimum is "+(grades[0])+"\nThe maximum is "+(grades[grades.length-1]));

        br.close();
    }
    public static double findAvg(int[] grades){
        int index=0;
        double avg=0;
        while (index<grades.length){
            avg+=grades[index];
            index++;
        }
        avg/=(grades.length);
        return avg;
    }
    public static boolean validGrade(int grade){
        if (grade<1 || grade>100){
            return false;
        }
       return true;
    }
}
