package com.qa.day3;

public class Flowchart2 {
public static int A = 100;

    public static void main(String[] args) {
        while (A <=200) {
            if (A%2 == 0) {
                System.out.println("-");
            }
            else {
                System.out.println("*");
            }
            A= A +1;
        }
    }
}
