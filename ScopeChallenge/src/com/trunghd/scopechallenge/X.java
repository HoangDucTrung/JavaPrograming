/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.scopechallenge;

import java.util.Scanner;

/**
 *
 * @author trunghd
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x() {
        for (int i = 0; i < 13; i++) {
            System.out.println(i + " times " + this.x + " equals " + i * this.x);
        }
    }
    
}
