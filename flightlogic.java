package com.fourthproject.myproject;

public class flightlogic {


    public double passengers;
    public double seats;

 public void flight() {               //This is the constructor
        seats = 150;
        passengers = 0;
    }


    public String add1Passenger(){        //This is the method
        if (passengers < seats) {
            passengers = passengers + 1;
        }else {
            handleToMany();
        }
        return  "Added Passenger";
    }

private String handleToMany() {

        return "Too many passengers";

}


    }



