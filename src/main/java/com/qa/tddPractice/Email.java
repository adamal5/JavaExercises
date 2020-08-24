package com.qa.tddPractice;

public class Email {

    public static boolean isValidEmail(String email) {
        boolean boolo;
        if (email.endsWith("@qa.com") || email.endsWith("@gmail.com")) {
            if (!email.startsWith("@") && !email.startsWith("_") && !email.endsWith(")")) {
                boolo= true;}
            else {boolo=false;}
        }
        else {boolo= false;}
        return boolo;
    }
        public static void main (String[]args){
            System.out.println(isValidEmail("@gmail.com"));
        }
    }