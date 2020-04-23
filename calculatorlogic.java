package com.fourthproject.myproject;

public class calculatorlogic {

    public double val1;
    public double val2;
    public double result;
    public char opcode;


    public void values() {
    }

    double val1 = 10.0d;
    double val2 = 5.0d;
    double result;
    char opcode = 'a';
}

public String calculator(){
    (If opcode == 'a'){
        result = val1 + val2;
        else if (opcode == 's')
            result = val1 - val2;
        else if (opcode == 'm')
            result = val1 * val2;
        else if (opcode == 'd')

            result = val2!=0 ? val1/val2:0.0d;


        else {
            result = 0.0d;
            System.out.println("Invalid Opcode");
        }
    }





}
