package com.test.askiseis;

public class Askisi5 {

    private float number;

    private int length;


    public Askisi5(float number){
        this.number = number;
        this.length = String.valueOf((int)this.number).length(); //xreiazetai metatroph se
        // integer giati to pernei san float me .0
    }

    public int getLength () {
        return length;
    }


}
