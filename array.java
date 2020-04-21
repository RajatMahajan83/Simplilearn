package com.fourthproject.myproject;

public class array {

    public static void main(String[] args) {

/*
        float[] mymarks = new float[3];
        mymarks[0] = 10.0f;
        mymarks[1] = 20.0f;
mymarks[2] = 30.0f;

float sum = 0.0f;


        for ( int i = 0; i < mymarks.length;i++) {
            sum = sum + mymarks[i];

            System.out.println(mymarks[i]);
        }


        System.out.println(sum);


 */


        String [] city = {"London","newYork","Amsteradam","Delhi"};

        //for (int i=0; i < city.length;i++) {


            for (String myCity:city) {


                System.out.println(myCity);
            }







/*
        int [] marks = {10,20,30,40};
        int total = 0;

        for (int initVal: marks) {

            total = total + initVal;
        }
        System.out.println(total);

*/



    }


}