package com.test.askiseis;

public class IntegerDivisors {
    int integer;

    IntegerDivisors(int integer) {
        this.integer = integer;
        int i = 0;

        for (i = 1; i <= this.integer; i++) {
            if (integer % i == 0) {
                System.out.println ( i );


            }
        }
    }

}
