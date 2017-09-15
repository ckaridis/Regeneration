package com.test.askiseis;

import java.util.Scanner;

public class FibonacciSequence {

    public FibonacciSequence ()

    {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Please define the number of repeats" );
        float number = scan.nextInt ();


        float sum2 = 1;
        float sum3 = 0;
        int i = 0;

        while (i < number) {
            float sum1 = sum2 + sum3;
            sum2 = sum3;
            sum3 = sum1;

            System.out.println ( sum1 );
            i++;
        }
    }
}


