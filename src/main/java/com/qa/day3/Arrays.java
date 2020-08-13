package com.qa.day3;

public class Arrays {

    public static int [] numArray = new int[10];
    public static int [] num2Array = new int [10];
    public static int k=0;

    public static void main(String[] args) {
        /*numArray[0] = 1;
        numArray[1] = 2;
        numArray[2] = 3;
        numArray[3] = 4;
        numArray[4] = 1;
        numArray[5] = 15;
        numArray[6] = 1;
        numArray[7] = 16;
        numArray[8] = 14;
        numArray[9] = 12;

        for (int i = 0; i <= numArray.length; i++) {
            System.out.println(numArray[i]);
        }

        for (int j = 0; j <= num2Array.length; j++) {
            num2Array[j]= j;
            System.out.println(num2Array);
        }*/

        while (k <= num2Array.length){
            num2Array[k]= k*10;
            System.out.println(num2Array);
            k = k+1;
        }
    }
}
