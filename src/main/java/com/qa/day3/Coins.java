package com.qa.day3;

public class Coins {

    public static void getChange(double cost, double amount) {
        double change = amount - cost;
        int intPart = (int) change;
        int units = intPart % 10;
        int tens = (intPart - units) / 10;
        if (change > 0) {
            System.out.println("Give customer the following change:");

//      NOTES
            if (intPart % 10 >= 5) {
                System.out.println("1 £5 Note");
            }
            if (tens == 1) {
                System.out.println("1 £10 Note");
            }
            if (tens == 2) {
                System.out.println("1 £20 Note");
            }
            if (tens == 3) {
                System.out.println("1 £20 Note");
                System.out.println("1 £10 Note");
            }
            if (tens == 4) {
                System.out.println("2 £20 Note");
            }
            if (tens >= 5) {
                System.out.println("1 £50 NOte");
                if (tens == 6) {
                    System.out.println("1 £10 Note");
                }
                if (tens == 7) {
                    System.out.println("1 £20 Note");
                }
                if (tens == 8) {
                    System.out.println("1 £20 Note");
                    System.out.println("1 £10 Note");
                }
                if (tens == 9) {
                    System.out.println("2 £20 Notes");
                    System.out.println("1 £10 Note");
                }
            }
            // COINS
                if (units == 4 || units ==9) {
                    System.out.println("2 £2 Coins");
                }
                if (units == 3 || units == 8) {
                    System.out.println("1 £2 Coin");
                    System.out.println("1 £1 Coin");
                }
                if (units == 2 || units == 7) {
                    System.out.println("1 £2 Coin");
                }
                if (units == 1 || units == 6) {
                    System.out.println("1 £1 Coin");
                }

        }
    }

    public static void main(String[] args) {
        getChange(23.00, 50.00);
    }
}
