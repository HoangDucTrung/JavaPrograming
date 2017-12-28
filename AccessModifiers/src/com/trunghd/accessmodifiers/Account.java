/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.accessmodifiers;

import java.util.ArrayList;

/**
 *
 * @author trunghd
 */
public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }
    
    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }
        else {
            System.out.println("Cannot deposit negetive sums");
        }
    }
    
    public void withdraw(int amount) {
        int withdraw = -amount;
        if(withdraw < 0) {
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println(amount + " withdraw. Balance is now " + this.balance);
        }
        else {
            System.out.println("Cannot withdraw negative sums");
        }
    }
    
    public void calculateBalance() {
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
