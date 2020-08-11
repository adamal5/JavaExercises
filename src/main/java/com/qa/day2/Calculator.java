package com.qa.day2;

public class Calculator {
    public static int addition(int a, int b){
        return a+b;
    }

    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int subtraction(int a, int b){
        return a-b;
    }

    public static double division(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println(addition(6, 8));
    }
}
