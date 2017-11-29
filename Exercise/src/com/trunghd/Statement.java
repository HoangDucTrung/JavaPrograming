package com.trunghd;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
	}
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
