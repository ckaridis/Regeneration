package com.test.askiseis;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class MainProgram {

    public static void main ( String[] args ) {

        int input = 0;
        float input2 = 0;
        float result = 0;
        int i = 0;

        do {
            // epanalipsh gia na doulepsei panw apo mia askhsh
            // edw ksekinaei to programma. zhtaei ton arithmo ths askishs

            System.out.println ( "Please enter the number of exercise " );
            // edw diavazei ton arithmo pou tou dwsame
            Scanner scan = new Scanner ( System.in );
            // h metablith input tha pernei to apotelesma kai tha fortinei
            //thn katallhlh askhsh
            input = scan.nextInt ();
            switch (input) {
                case 1:
                    System.out.println ( "1 Selected" );
                    i = 0;
                    result = 0;
                    input2 = scan.nextInt ();
                    while (i <= input2) {
                        result = result + i;
                        i++;
                        System.out.println ( result );
                    }
                    break;

                case 2:
                    System.out.println ( "2 Selected" );
                    System.out.println ( "Please give us the number" );
                    float number = scan.nextInt ();
                    System.out.println ( "Please give us the power" );
                    float power = scan.nextInt ();
                    System.out.println ( "the result is: " + Math.pow ( number, power ) );
                    break;

                case 3:
                    i = 1;
                    result = 1;
                    while (i < 100) {
                        result = result + (float) 1 / i;
                        System.out.println ( "The result is: " + result );
                        i++;
                    }
                    break;
                case 4:
                    System.out.println ( "Please give us a number" );
                    number = scan.nextInt ();
                    result = number % 2;
                    if (result == 0) {
                        System.out.println ( "This number is EVEN" );
                    } else {
                        System.out.println ( "This number is ODD" );
                    }
                    break;
                case 5:
                    System.out.println ( "Please give us a number" );
                    number = scan.nextInt ();
                    int length = 0;
                    length = String.valueOf ( (int) number ).length (); //xreiazetai metatroph se
                    // integer giati to pernei san float me .0
                    System.out.println ( "The number of digits is: " + length );
                    break;
                case 6:
                    //System.out.println ( "=== UNDER CONSTRUCTION ===" );
                    System.out.println ( "Please give us a number" );
                    number = scan.nextInt ();

                    for (i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            System.out.println ( i );

                        }
                    }
                    break;
                case 7:
                    System.out.println ( "Please define the number of repeats" );
                    number = scan.nextInt ();
                    float sum2 = 1;
                    float sum3 = 0;
                    i = 0;
                    while (i < number) {
                        float sum1 = sum2 + sum3;
                        sum2 = sum3;
                        sum3 = sum1;

                        System.out.println ( sum1 );
                        i++;
                    }
                    break;
                case 17:
                    Askisi7 ask7 = new Askisi7 ();
                    break;

                case 16:
                    Askisi6 ask6 = new Askisi6 ();
                    break;
                case 20:
                    System.out.println ( "Please give us a number" );
                    number = scan.nextInt ();
                    Askisi5 ask5 = new Askisi5 ( number );
                    System.out.println ( "The number of digits is: " + ask5.getLength () );
                    break;

                    }

            System.out.println ( "=== END OF EXERCISE ===" );
            System.out.println ( "==== TYPE 0 TO EXIT ===" );
        }
        while (input != 0);
        System.out.println ( "Good Bye!!" );


        //kleinei h main
    }
//Kleinei to MainProgram
}
