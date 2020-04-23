package com.fourthproject.myproject;

public class flight {           //This is the class

    public static void main(String[] args) {

        flightlogic myflight = new flightlogic();
        double output = myflight.passengers;

        String output1 = myflight.add1Passenger();

        System.out.println(output1);


/*
    flight nyctoSf;
    nyctoSf = new flight();            //This is the object of the class

    flight slcToDallas;
    slcToDallas = new flight();        //This is the object of the class
    slcToDallas.add1Passenger();      //This is how we call the method of the class

*/
    }



}
