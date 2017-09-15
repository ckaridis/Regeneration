package com.test.askiseis;

public class FibonacciCalculator {
    int integer;
    int sum1 = 0;

    FibonacciCalculator (int integer){
        integer=this.integer;

    }

    public int fibonacciCalculator () {

        int sum2 = 1;
        int sum3 = 0;
        int i = 0;
        while (i < this.integer) {
            sum1 = sum2 + sum3;
            sum2 = sum3;
            sum3 = sum1;

            System.out.println(sum1);
            i++;
        }
        return sum1;

    }


}
