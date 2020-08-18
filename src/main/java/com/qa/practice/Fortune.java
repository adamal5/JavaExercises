package com.qa.practice;
import java.util.*;

public class Fortune {
    public static int number;

    public static int randomNumber() {
        int min = 1;
        int max = 5;
        int x = (int)(Math.random()*((max-min)+1))+min;
        number = x;
        return x;
    }

    public static String advice(int number){
        if (number == 1){
            return "Your life will be filled with great mystery";
        }
        else if (number == 2){
            return "One cannot pour from an empty cup, replenish yourself in order to replenish the world";
        }
        else if (number == 3){
            return "First seek the greatness within you then the greatness of the universe will become apparent";
        }
        else if (number == 4){
            return "You are love, you'd do well to remember that";
        }
        else {
            return "Take a leap of faith, explore, enjoy. Youre never to old to live life";
        }
    }

    public static void main(String[] args){
        randomNumber();
        System.out.println (advice(number));
    }

}
