package com.qa.day3;

public class Coins {

    public static void getChange(double cost, double amount){
        double change = amount - cost;
        int intPart = (int) change;

        if (change > 0) {
            System.out.println("Give customer the following change:");

            if (intPart>=5 && intPart <10){
                System.out.println("1 £5 Note");
            }if (intPart>10 && intPart<20){
                System.out.println("1 £10 Note");
            }if (intPart>20 && intPart<30){
                System.out.println("1 £20 Note");
            }if (intPart>30 && intPart<40){
                System.out.println("1 £20 Note");
                System.out.println("1 £10 Note");
            }
        }


    }

    public static void main(String[] args) {
        getChange(15.00, 20.00);
    }
}
