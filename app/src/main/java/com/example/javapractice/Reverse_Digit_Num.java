package com.example.javapractice;
import java.util.Scanner;

public class Reverse_Digit_Num {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int inNum = input.nextInt();
    int reversed = 0;

    while (inNum!=0){
        int single = inNum % 10;
            reversed = reversed * 10 + single;
            inNum/=10;
    }
System.out.println("Reversed Number: " + reversed);
    }
}
