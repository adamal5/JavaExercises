package com.qa.day7;

public class Exceptions {

    public static int doDivision(int a, int b){
        try {
            return a/b;

        } catch (ArithmeticException zeroDivide){
            System.out.println("Cannot divide an integer by 0, answer is infinity.");
        }
        catch (IllegalArgumentException notInteger){
            System.out.println("One or both of your numbers are not an integer, try again.");
        }
        return 0;
    }

    public static void main(String[] args) {
        doDivision(6,0);
    }
}
