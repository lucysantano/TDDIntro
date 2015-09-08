package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by lucysantano on 15-09-08.
 */
public class Account {

    private int balance;

    public void setStartingBalance(int amount){
        balance = amount;
    }

    public void deposit(int i) {
        balance+=i;
    }

    public void withdraw(int i) {
        if(i<balance) {
            balance -= i;
        }
    }

    public int getBalance() {
        return balance;
    }


}
