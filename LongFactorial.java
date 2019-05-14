package com.pe2;

public class LongFactorial {
    public static void main(String[] args) {
        calculateIntFactorial();
        calculateLongFactorial();
    }

    public static void calculateIntFactorial() {
        int start=1,factorial=1;
        System.out.println("Int Factorials:");
        System.out.println("The factorial of "+start+" is "+factorial);

        while (true) {
            start++;
            factorial*=start;
            if (factorial<0){
                System.out.println("The factorial of "+start+" is out of range");
                break;
            }
            System.out.println("The factorial of "+start+" is "+factorial+"\n");
        }

    }
    public static void calculateLongFactorial(){
        int start=1;
        long factorial=1;
        System.out.println("\nLong Factorials:");
        System.out.println("The factorial of "+start+" is "+factorial+"\n");

        while (true) {
            start++;
            factorial*=start;
            if (factorial<0){
                System.out.println("The factorial of "+start+" is out of range");
                break;
            }
            System.out.println("The factorial of "+start+" is "+factorial+"\n");
        }
    }

}
