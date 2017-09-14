package com.test.askiseis;

public class SumSequence {
    int i=0;
    float nnumber;
    int result;

    public void setNnumber ( int nnumber ) {
        this.nnumber = nnumber;
    }

    public SumSequence ( float nnumber) {
        this.nnumber=nnumber;
        while (i <= this.nnumber) {
            this.result = this.result + i;
            i++;
        }
    }

    public int getResult () {
    return this.result;
    }

}
