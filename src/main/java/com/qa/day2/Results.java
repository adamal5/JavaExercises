package com.qa.day2;

public class Results {

    public static double physics;
    public static double chemistry;
    public static double biology;
    public static double total;
    public static double percentage;

    public static void getMark(){
        System.out.println("You got " + physics + " in your physics exam.");
        System.out.println("You got " + chemistry + " in your chemistry exam.");
        System.out.println("You got " + biology + " in your biology exam.");
        System.out.println("You got " + total + " in total.");
    }

    public static void getPercentage(){
        percentage = (total / 450) * 100;
        double bioPercent = (biology/150) *100;
        double chemPercent = (chemistry/150) *100;
        double physPercent = (physics/150) *100;
        System.out.println("Your overall percentage is " + percentage);

        // Individual exam results
        if (percentage >= 60 && bioPercent >=60 && chemPercent >=60 && physPercent >=60){
            System.out.println("You passed!");}
            else if(percentage >= 60 && bioPercent >=60 && chemPercent >=60 && physPercent <60){
                System.out.println("You have failed to pass your Physics exam, contact the Physics department.");
            }
            else if(percentage >= 60 && bioPercent >=60 && chemPercent <60 && physPercent >=60){
                System.out.println("You have failed to pass your Chemistry exam, contact the Chemistry department.");
            }
            else if(percentage >= 60 && bioPercent <60 && chemPercent >=60 && physPercent >= 60){
                System.out.println("You have failed to pass your Biology exam, contact the Biology department.");
            }
        else {
            System.out.println("You've failed, please contact your department");
        }
    }

    public static void main(String[] args) {
        physics = 140;
        chemistry = 50;
        biology = 100;
        total = biology +chemistry + physics;
        getMark();
        getPercentage();
    }
}
