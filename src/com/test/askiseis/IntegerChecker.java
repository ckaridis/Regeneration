package com.test.askiseis;

public class IntegerChecker {
    boolean ret;

    public IntegerChecker (int intnum) {
        int result = (intnum % 2);
        if (result == 0) {
            ret = true;
        } else {
            ret = false;
        }
    }

    public boolean isRet () {
        return ret;
    }
}