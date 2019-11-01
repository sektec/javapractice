package com.example.javapractice;
import java.util.*;

public class Num_PalindromeQ {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Type in the number you want to check if its a palindrome or not: ");
    int num = input.nextInt();
    int counter1 = 0;
    int original = num;

    while (num>0){
        int single = num % 10;
        counter1 = (counter1 * 10) + single;
        num/=10;
        }
    if (original == counter1)
        System.out.println("This is a palindrome");
    else
        System.out.println("This is not a palindrome");
    }
}
