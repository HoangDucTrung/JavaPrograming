package com.trunghd;

public class Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
		System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
		
		for (int i=0; i<5; i++) {
			System.out.println("Loop " + i + " hello!");
		}
		
		for (int i=2; i<9; i++) {
			System.out.println("10000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
		}
		
		System.out.println("****************************************");
		
		for (int i=8; i>=2; i--) {
			System.out.println("10000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
		}
		
		int count = 0;
		for (int i = 2; i< 50; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("Number "+i+" is a prime number");
				if (count == 10) {
					System.out.println("Exiting for loop");
					break;
				}
			}
		}
		
//		System.out.println("****************************************");
//		
//		int number = 5;
//		int finishNumber = 20;
//		while (number <= finishNumber) {
//			if(!isEvenNumber(number)) {
//				number ++;
//				continue;
//			}
//			
//			System.out.println("Even number " + number);
//			number ++;
//		}
		
		System.out.println("****************************************");
		
		int number = 5;
		int finishNumber = 20;
		int evenNumberFound = 0;
		while (number <= finishNumber) {
			if(!isEvenNumber(number)) {
				number ++;
				continue;
			}
			
			System.out.println("Even number " + number);
			number ++;
			
			evenNumberFound ++;
			if (evenNumberFound >=5) {
				break;
			}
		}
		System.out.println("Total even numbers found = " + evenNumberFound);
	}
	
	
	public static boolean isEvenNumber (int number) {
		if((number % 2) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int n) {
		
		if (n == 1) {
			return false;
		}
		
		for (int i=2; i<=(long) Math.sqrt(n); i++) {
			System.out.println("Looping "+ i);
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate / 100));
	}

}
