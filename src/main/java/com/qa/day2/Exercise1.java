package com.qa.day2;

public class Exercise1 {
    public static int checkValue(int a, int b, boolean c) {
        if (c) {
            return a + b;
        } else {
            return a * b;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkValue(6, 7, true));
    }
}
