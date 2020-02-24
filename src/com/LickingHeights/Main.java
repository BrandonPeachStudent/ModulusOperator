package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

int number;

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter a positive whole number");
number = keyboard.nextInt();

System.out.println("Number is odd: "+(number % 2 !=0));




        Scanner keep = new Scanner(System.in);
        System.out.println("Enter another positive whole number");
        number = keep.nextInt();

        System.out.println(number+" contained is: "+(number % 8+5));










    }
}
