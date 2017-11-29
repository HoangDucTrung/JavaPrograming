package main;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i < 11 ; i++) {
        	int x = N * i;
        	System.out.println(N+" x "+i+" = "+x);
        }
	}

}
