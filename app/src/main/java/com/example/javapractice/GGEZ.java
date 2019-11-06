package com.example.javapractice;
import java.util.*;
public class GGEZ{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        /*
        2.)  Decision Making - greater than less than or equal to 5.
        5.)  Swap Two Numbers - enter #of lines: with a space, create two numbers & print backwards.
        8.)  Binary to Decimal - enter 9 ch max int.(10000000 - 0)
        11.) Middle of three - enter three numbers with space in between
        */
        System.out.println("Enter two numbers with a space in between");
        int num = input.nextInt();
        eight(num);
    }
    public static void eight(int num){
        if(num < 0 || num > 10000000)System.exit(420);

    }
}