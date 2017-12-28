/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trunghd.mylibrary;

/**
 *
 * @author trunghd
 */
public class Series {
    public static long nSum(int n) {
        return (n * (n+1))/2;
    }
    
    public static long factorial(int n) {
        if (n == 0) {
            return 0;
        }
        long fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i = 0; i < n; i++) {
            fib = (nMinus1 + nMinus2);
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
