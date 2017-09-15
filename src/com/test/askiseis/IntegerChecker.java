package com.test.askiseis;

public class IntegerChecker {
    boolean ret;

    public IntegerChecker (int intnum) {
        int result = (intnum % 2);
        ret = result == 0;
    }

    public boolean isRet () {
        return ret;
    }
}