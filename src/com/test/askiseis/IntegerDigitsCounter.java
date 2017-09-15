package com.test.askiseis;

public class IntegerDigitsCounter {
    int integer;

    IntegerDigitsCounter (int integer) {
        this.integer = integer;
    }


    public int integerDigitsCounter(){
        int length = 0;
        length = String.valueOf ( this.integer ).length ();
        return length;
    }
}
