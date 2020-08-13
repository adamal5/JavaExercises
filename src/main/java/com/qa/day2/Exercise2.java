package com.qa.day2;

public class Exercise2 {

    public static void main(String[] args) {
        int A = 10000;
        //Start

        if (A > 2000) {
            System.out.println("A");
        } else {
            System.out.println("1");
        }
        //Branch Letters
        if (A > 6000) {
            System.out.println("C");
        } else if (A> 2000 && A< 6000){
            System.out.println("B");
        }

        if (A > 4000 && A <6000) {
            System.out.println("D");
        } else if (A> 2000 && A<4000){
            System.out.println("E");
        }
        // Branch Numbers
        if (A > 100 && A < 2000) {
            System.out.println("3");
        } else if (A < 100) {
            System.out.println("2");
        }

        if (A > 600 && A < 2000) {
            System.out.println("5");
        } else if (A > 100 && A < 600) {
            System.out.println("4");
        }

        if (A > 500 && A < 600) {
            System.out.println("6");
        } else if (A > 100 && A <500) {
            System.out.println("7");
        }

    }
}