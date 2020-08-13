package com.qa.day3;

public class Coins {

    public static void getChange(double cost, double amount){
        double change = amount - cost;
        int intPart = (int) change;
        int units = intPart % 10;

        if (change > 0) {
            System.out.println("Give customer the following change:");

            if (intPart%10 >= 5){
                System.out.println("1 £5 Note");
            }if (intPart>10 && intPart<20){
                System.out.println("1 £10 Note");
            }if (intPart>20 && intPart<30){
                System.out.println("1 £20 Note");
            }if (intPart>30 && intPart<40){
                System.out.println("1 £20 Note");
                System.out.println("1 £10 Note");
            }
            if (intPart>40 && intPart<50){
                System.out.println("2 £20 Note");
            }
            if (units==4){
                System.out.println( "2 £2 Coins");
            }
            if (units==3){
                System.out.println( "1 £2 Coins");
                System.out.println( "1 £1 Coins");
            }
            if (units ==2){
                System.out.println("1 ");
            }
        }


    }

    public static void main(String[] args) {
        getChange(23.00, 50.00);
    }
}
