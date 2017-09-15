package com.test.askiseis;

import java.util.Scanner;
//test

public class MainProgram {

    public static void main ( String[] args ) {

        int input = 0;
        float nnumber;

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

                case 1: // SumSequence -- me Setter/Getter
                    System.out.println ( "1 Selected" );
                    System.out.println ( "Implement a program that calculates the sum of 1+2+3 .. +N" );
                    System.out.println ( "Please give us the N number" );
                    nnumber = scan.nextInt ();
                    SumSequence sumseq = new SumSequence (nnumber);
                    System.out.println ( "The result is: " + sumseq.getResult () );
                    break;

                case 2: // a^n -- me Setter/Getter
                    System.out.println ( "2 Selected" );
                    System.out.println ( "Implement a Java program that calculates a^n given that a and n are integers" );
                    System.out.println ( "Please give us the a number" );
                    float numbera = scan.nextInt ();
                    System.out.println ( "Please give us the n number" );
                    nnumber = scan.nextInt ();
                    System.out.println ( "the result is: " + Math.pow ( numbera, nnumber ) );
                    break;

                case 3: // ReversedSumSequence -- me Setter/Getter
                    System.out.println ( "3 Selected" );
                    System.out.println ( "Implement a Java program that calculates the sum of 1+ 1/2 + 1/3 + ... 1/n" );
                    System.out.println ( "Please give us the n number" );
                    nnumber = scan.nextInt ();
                    ReversedSumSequence revsum = new ReversedSumSequence (nnumber);
                    System.out.println ( "The result is: " + revsum.getResult () );
                    break;

                case 4: // IntegerChecker -- me Setter/Getter
                    System.out.println ( "4 Selected" );
                    System.out.println ( "Implement a Java program that checks if the given integer is an odd or not" );
                    System.out.println ( "Please give us the integer" );
                    int intnum = scan.nextInt ();
                    IntegerChecker intcheck = new IntegerChecker(intnum);
                    System.out.println ( "This integer is odd is: " + intcheck.isRet () );
                    break;

                case 5: // IntegerDigitsCounter -- me Constructor
                    System.out.println ( "5 Selected" );
                    System.out.println ( "Implement a Java program that prints the digits of a given integer" );
                    System.out.println ( "Please give us the Integer" );
                    int integer = scan.nextInt ();
                    IntegerDigitsCounter intdig = new IntegerDigitsCounter (integer);
                    System.out.println ( "The number of digits is:" + intdig.integerDigitsCounter () );
                    break;

                case 6: // IntegerDivisors me Constructor
                    System.out.println ( "6 Selected" );
                    System.out.println ( "Implement a Java program that prints the divisors of a given integer" );
                    System.out.println ( "Please give us the Integer" );
                    integer = scan.nextInt ();
                    IntegerDivisors intdiv = new IntegerDivisors ( integer );
                    break;

                case 7: //FibonacciCalculator NOT WORKING
                    System.out.println ( "7 Selected" );
                    System.out.println ( "Implement a Java program that calculates the Fibonacci sequence" );
                    System.out.println ( "Please give us the number of repeats" );
                    integer = scan.nextInt ();
                    FibonacciCalculator fibcalc = new FibonacciCalculator(integer);
                    System.out.println(fibcalc.sum1);
                    break;

                case 17:
                    FibonacciSequence fib = new FibonacciSequence ();
                    break;

                case 16:
                    Askisi6 ask6 = new Askisi6 ();
                    break;
                case 20:
                    System.out.println ( "Please give us a number" );
                    int number = scan.nextInt ();
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
