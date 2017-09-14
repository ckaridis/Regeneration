package com.test.askiseis;

public class ReversedSumSequence {

    int i = 1;
    float result = 1;
    float nnumber;

    public void setNnumber ( int nnumber ) {
        this.nnumber = nnumber;
    }

    public ReversedSumSequence (float nnumber){
        while (i < nnumber) {
            result = result + (float) 1 / i;
            i++;
        }
    }

    public float getResult () {
        return this.result;
    }
}
