package com.example.javapractice;
import java.util.*;
public class GGEZ{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        /*
        2.)  Decision Making - greater than less than or equal to 5.
        5.)  Swap Two Numbers - enter #of lines: with a space, create two numbers & print backwards.
        8.)  Binary to Decimal - enter 9 ch max int.(10000000 - 0)
        11.) Middle of three - enter three numbers with space in between    int num = 2;
        */
        System.out.println("Enter an Integer (0-9) to see if it is >, <, or = to 5.");
        int num = input.nextInt();
        DecisionMaking.two(num);
    }
}