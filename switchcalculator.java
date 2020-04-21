package com.fourthproject.myproject;

public class switchcalculator {

    public static void main(String[] args) {


           double [] leftVal =  {100.0d,25.0d,325.0d,11.0d};
           double [] rightval = {50.0d,95.0d,225.0d,31.0d};


           char [] opcode = {'a','s','m','d'};
        double [] result = new double[opcode.length] ;
/*
           for (int i=0; i < opcode.length; i++) {
               if (opcode[i] == 'a')
                   result[i] = leftVal[i] + rightval[i];
               else if (opcode[i] == 's')
                   result[i] = leftVal[i] - rightval[i];
               else if (opcode[i] == 'm')
                   result[i] = leftVal[i] * rightval[i];
               else if (opcode[i] == 'd')

                   result[i]  = rightval[i] != 0 ? leftVal[i] / rightval[i] : 0.0d;


else {
                   result[i] = 0.0d;
                   System.out.println("Invalid Opcode");
               }

for (double theresult:result) {
    System.out.println(theresult);
}
}

 */



        for (int i=0; i < opcode.length; i++) {
            switch (opcode[i]) {

                case 'a':
                    result[i] = leftVal[i] + rightval[i];
                    break;
                case 's':
                    result[i] = leftVal[i] - rightval[i];
                    break;
                case 'm':
                    result[i] = leftVal[i] * rightval[i];
                    break;
                case 'd':
                    result[i] = rightval[i] != 0 ? leftVal[i] / rightval[i] : 0.0d;
break;
                default:
                    result[i] = 0.0d;
                    System.out.println("Invalid Opcode");
            }
        }

                    for (double theresult : result) {
                        System.out.println(theresult);
                    }

            }
        }