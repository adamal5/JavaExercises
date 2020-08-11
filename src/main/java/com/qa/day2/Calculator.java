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

    public static double division(double a, double b) {
        double result = 0;
        if (a > b) {
            result = 0;
            System.out.println("Cannot perform");
        } else {result = b/a;
        System.out.println("THe answer is " + result);}
        return result;
    }
    public static void main(String[] args) {
        System.out.println(division(12, 10));
    }
}
