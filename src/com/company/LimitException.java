package com.company;

import javax.naming.LimitExceededException;

public class LimitException extends Exception {
    private double remainingAmount;

    public LimitException(String s, double remainingAmount) {
        super(s);
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

}

