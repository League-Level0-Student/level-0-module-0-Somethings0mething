package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below
		public static void main(String[] args) {
			
		
	
			Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
			int vars = 0;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
			vars = ran.nextInt(4);
		// 3. Print your variable to the console
			System.out.println(vars);
		// 4. Get the user to enter something that they think is awesome
			String thingy = JOptionPane.showInputDialog("Write down something you think is cool: ");
		// 5. If your variable is  0
			if (vars == (0)) {
				System.out.println("Well hot diggity dog! It looks like " + thingy + " is pretty awsome!");
			}
			// -- tell the user whatever they entered is awesome!
			
		// 6. If your variable is  1
			else if (vars == (1)) {
				System.out.println("Oh? " + thingy + " you say? Meh, that's alright I guess.");
			}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
			else if (vars == (2)) {
				System.out.println(thingy + "? Boring. Next.");
			}
	
			// -- tell the user whatever they entered is boring.
			
		// 8. If your variable is  3
			else if (vars ==(3)) {
				System.out.println("... At this point I don't know what to say. " + thingy + "? Seriously?");
			}
			// -- invent your own message to give to the user (be nice).
		}
}
