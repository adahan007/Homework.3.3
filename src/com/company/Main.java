package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.deposit(20000);
        } catch (LimitException limitException) {
            limitException.printStackTrace();
        }
        while (true) {
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException limitException1) {
                    limitException1.printStackTrace();
                }
                break;
            }
        }
    }
}
