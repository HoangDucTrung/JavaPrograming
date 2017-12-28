/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.scope;

/**
 *
 * @author trunghd
 */
public class ScopeCheck {

    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("Scope created, publicVar = " + publicVar + ": privateVar = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }
    
    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {

        public int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass create, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne is still available hereL " + varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }
    }
}
