package com.qa.day4;
import java.util.Scanner;

public class ScannerCalculator {

    public static void addition(int a, int b){
        int result= a+b;
        System.out.println("The answer is: " +result);
    }
    public static void subtraction(int a, int b){
        int result= a-b;
        System.out.println("The answer is: " + result);

    }
    public static void multiplication(int a, int b){
        int result= a*b;
        System.out.println("The answer is: " +result);
    }

    public static void division(int a, int b){
        int result= a/b;
        System.out.println("The answer is: " +result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Operation (addition(a), subtraction (s), multiplication(m), division(d): ");
        String operation = scan.nextLine();

        System.out.println("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = scan.nextInt();

        if (operation.equals("a")){
        addition(num1,num2);
        }

        if (operation.equals("s")){
            subtraction(num1,num2);
        }

        if (operation.equals("m")){
            multiplication(num1,num2);
        }

        if (operation.equals("d")){
            division(num1,num2);
        }



    }

    }
