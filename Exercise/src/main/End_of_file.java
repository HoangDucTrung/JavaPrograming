package main;

import java.util.Scanner;

public class End_of_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		   for(int i = 1; scan.hasNext(); i++){
		       System.out.println(i + " " + scan.nextLine());
		   }

	}

}
