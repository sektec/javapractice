package com.example.javapractice;
public class DecisionMaking{
    public static void two(int num){
        if(num < 0 || num > 9)System.exit(420);
        if(num<5)System.out.println(num + " is less than 5.");
        else if(num>5)System.out.println(num + " is more than 5.");
        else System.out.println(num + " is equal to 5.");
    }
}