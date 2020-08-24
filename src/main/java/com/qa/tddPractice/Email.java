package com.qa.tddPractice;

public class Email {

    public static boolean isValidEmail(String email) {
        boolean boolo;
        if (email.endsWith("@qa.com") || email.endsWith("@gmail.com")) {
            boolo= !email.startsWith("@") && !email.startsWith("_") && !email.endsWith(")");
        }
        else {boolo= false;}
        return boolo;
    }
        public static void main (String[]args){
            System.out.println(isValidEmail("adama@gmail.com"));
        }
    }