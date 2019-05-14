package com.pe2;

public class MemberVariable {
    public static void main(String[] args) {
        Member member=new Member("Harry Potter",30,2500.3);
        System.out.println("Members Name: "+member.name);
        System.out.println("Members Age: "+member.age);
        System.out.println("Members Salary: "+ member.salary);
    }
}
