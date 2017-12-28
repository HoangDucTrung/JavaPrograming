/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.accessmodifiers;

/**
 *
 * @author trunghd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account trunghdAccount = new Account("trung");
        trunghdAccount.deposit(1000);
        trunghdAccount.withdraw(500);
        trunghdAccount.withdraw(-200);
        trunghdAccount.deposit(-20);
        trunghdAccount.calculateBalance();
        trunghdAccount.balance = 5000;
        
        System.out.println("Balanc on account is " + trunghdAccount.getBalance());
        trunghdAccount.transactions.add(4500);
        trunghdAccount.calculateBalance();
    }
    
}
