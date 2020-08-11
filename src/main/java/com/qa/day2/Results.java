package com.qa.day2;

public class Results {
    int physics;
    int chemistry;
    int biology;
    int total;
    int percentage;

    public static void getMark(){
        System.out.println("You got " + physics + "in your physics exam.");
        System.out.println("You got " + chemistry + "in your chemistry exam.");
        System.out.println("You got " + biology + "in your biology exam.");
        System.out.println("You got" + total " in total.");
    }
}
