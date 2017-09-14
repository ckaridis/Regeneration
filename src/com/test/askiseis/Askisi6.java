package com.test.askiseis;

import java.util.Scanner;

public class Askisi6 {
    public Askisi6 () {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Please give us a number" );
        float number = scan.nextInt ();

        for (int i=1; i <=  number; i++) {
            if ( number % i == 0 ) {
                System.out.println ( i );


            }
        }
    }
}
