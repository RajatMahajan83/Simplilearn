package com.fourthproject.myproject;

public class Operators {

    public static void main(String[] args) {

        int myNum = 5;

//System.out.println(++myNum);

        //System.out.println(--myNum);


        int result = 10;
        //System.out.println(result);
        result += 2;
        // System.out.println(result);

        int total = 100;
        int val1 = 5;
        int val2 = 10;
        total /= val1 * val2;
        // System.out.println(total);


        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;

        int result3 = valA / (valC * (valD+ valB));

        //System.out.println(result1);

        //System.out.println(result2);

        System.out.println(result3);




    }

}



