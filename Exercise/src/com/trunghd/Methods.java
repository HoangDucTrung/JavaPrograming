package com.trunghd;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int finalScore = calculateScore(true, 800, 5, 100);
		if (finalScore != -1) {
			System.out.println("your final score was "+ finalScore);
		}
		
		finalScore = calculateScore(true, 10000, 8, 200);
		if (finalScore != -1) {
			System.out.println("your final score was "+ finalScore);
		}
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("trunghd", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("datpv", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("namln", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("kienlt", highScorePosition);
		
		int newScore = calculateScore("trunghd", 100);
		System.out.println("New score is "+ newScore);
		
		calculateScore(80);
		calculateScore();
		
		double centimeters = calcFeetAndInchesToCentimeters(6, 13);
		if (centimeters < 0.0) {
			System.out.println("Invaid parameter" + centimeters);
		}
		
		calcFeetAndInchesToCentimeters(100);
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if ((feet < 0) || ((inches < 0) || (inches > 12))) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet, " + inches + " inches, " + centimeters + " cm");
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 10;
		double remaining = (int) inches % 10;
		System.out.println(inches + " inches is equal to " + feet + " feet and "+ remaining + " inches");
		return calcFeetAndInchesToCentimeters(feet,remaining);
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore() {
		System.out.println("No player name, No player score");
		return 0;
	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position " +
							+ highScorePosition + "on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if (playerScore >= 1000)
			return 1;
		else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		}
		else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		}
		else {
			return 4;
		}
	}
	
	public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {		
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
		}
		else
		{
			return -1;
		}
	}

}
