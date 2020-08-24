package com.qa.tddPractice;

public class Email {

    public static boolean isValidEmail(String email) {
        boolean boolo = true;
        if (email.endsWith("@qa.com") || email.endsWith("@gmail.com")) {
            if (email.startsWith("@") | email.startsWith("_") | email.endsWith(")")) {
                boolo= false;}
        }
        else {boolo= true;}
        return boolo;
    }
        public static void main (String[]args){
            System.out.println(isValidEmail("_@gmail.com"));
        }
    }