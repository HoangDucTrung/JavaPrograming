package com.trunghd;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int value = 1;
//		if (value == 1) {
//			System.out.println("Value was 1");
//		}
//		else if (value == 2) {
//			System.out.println("Value was 2");
//		}
//		else {
//			System.out.println("Was not 1 or 2");
//		}
		
		int valueSwitch = 3;
		switch (valueSwitch) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3 : case 4 : case 5:
			System.out.println("Value was 3 or 4 or 5");
			System.out.println("Actualy it was a " + valueSwitch);
			break;
		default:
			System.out.println("Was not 1 or 2");
			break;
		}
		
		char charValue = 'A';
		switch (charValue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C': case 'D': case 'E':
			System.out.println(charValue+" was found");
			break;
		default:
			System.out.println("Could not find A,B,C,D OR E");
			break;
		}
		
		String month = "January";
		switch (month) {
		case "January":
			System.out.println("Jan");
			break;
		case "June":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not Sure");
		}
	}

}
