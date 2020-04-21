package com.fourthproject.myproject;

public class Calculatorifcondition {
    public static void main(String[] args) {

/*
           double val1 = 100.0d;
           double val2 =  50.0d;
           double result;
            char opcode = 'd';

             if (opcode == 'a')
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
             System.out.println(result);


*/













        double val1 = 10.0d;
        double val2 = 5.0d;
        double result;
        char opcode = 'a';
        switch (opcode) {

            case 'a':
                result = val1 + val2;
                System.out.println("result");
                break;
            case 's':
                result = val1 - val2;
                System.out.println("result");
                break;
            case 'm':
                System.out.println("result");
                break;
            case 'd':
                System.out.println("result");
                break;
            default:
                System.out.println("I don't know");

        }

        }
}
