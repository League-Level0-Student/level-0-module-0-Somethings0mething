package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String name = JOptionPane.showInputDialog("What is your name?");
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is the capital of Idaho?");		
				// 3.  Use an if statement to check if their answer is correct
		if (input .equals("Boise")) {		
				// 4.  if the user's answer was correct, add one to their score 
			System.out.println("Wowee, we got ourselves a winerrrrrrrr!");
			score += 1;
		}
		else {
			System.out.println("Woopsie! That's a big fat L for you!");
			score -= 1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String input2 = JOptionPane.showInputDialog("What is the capital of Tennessee?");
		if (input2 .equals("Nashville")) {		
			// 4.  if the user's answer was correct, add one to their score 
			System.out.println("Wowee, we got ourselves a winerrrrrrrr!");
			score += 1;
		}
		else {
			System.out.println("Woopsie! That's a big fat L for you!");
			score -= 1;
		}
		String input3 = JOptionPane.showInputDialog("What is the capital of New Mexico?");
		if (input3 .equals("Santa Fe")) {		
			// 4.  if the user's answer was correct, add one to their score 
			System.out.println("Wowee, we got ourselves a winerrrrrrrr!");
			score += 1;
		}
		else {
			System.out.println("Woopsie! That's a big fat L for you!");
			score -= 1;
		}
		String input4 = JOptionPane.showInputDialog("What is the capital of New York?");
		if (input4 .equals("Albany")) {		
			// 4.  if the user's answer was correct, add one to their score 
			System.out.println("Wowee, we got ourselves a winerrrrrrrr!");
			score += 1;
		}
		else {
			System.out.println("Woopsie! That's a big fat L for you!");
			score -= 1;
		}
		String input5 = JOptionPane.showInputDialog("What is the capital of Ohio?");
		if (input5 .equals("Columbus")) {		
			// 4.  if the user's answer was correct, add one to their score 
			System.out.println("Wowee, we got ourselves a winerrrrrrrr!");
			score += 1;
		}
		else {
			System.out.println("Woopsie! That's a big fat L for you!");
			score -= 1;
		}
		
		System.out.println("Well folks, that's all the questions we got for today! Let's see how many our dear contestant scored!");				
		// After all the questions have been asked, tell the user their final score 
		System.out.println("Your total amount of points scored was..." + score + "!");
		if (score == 5) {
			System.out.println("By Golly! Our contestant " + name + " has recieved a perfect score!");
		}
		else if (score < 5 && score > 3) {
			System.out.println("Well, that's not too bad of a score. Well done " + name + "!");
		}
		else if (score < 3 && score > 0) {
			System.out.println("Were you even trying " + name + "?");
		}
		else if (score < 0) {
			System.out.println("I don't even have anything else to say. You must really suck at this.");
		}
	}
}
