/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

import java.util.Scanner;

/**
 * Define attributes and behavior for Human players. Functionality to get human
 * player's name and to take turn in a round. Subclass of Player.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public class Human extends Player {
	
	private Scanner in;

	/**
	 * Public Human constructor. Takes Scanner input and initializes name.
	 * 
	 * @param in receives input for human's name.
	 */
	public Human(Scanner in) {
		super(in.next());
		this.in = in;
		// How many Scanner objects exist in memory at this point? Answer: 1.
	}

	/**
	 * Take input from human user and process.
	 * 
	 * @return true if turn is successful.
	 */
	public boolean takeTurn() {
		// What happens if the Human class does not implement the
		// takeTurn method?
		// The type Human must implement the inherited abstract method Player.takeTurn()
		// or the code will not compile.

		// local boolean variable to track state of turn.
		boolean playing = false;

		// Prompt user for input and decide what to do with it.
		do {
			System.out.print(NAME
					+ ", it’s your turn (Enter Ro for Rock, Pa for Paper, Sc for Scissors, Li for Lizard, Sp for Spock, or Q to quit): ");
			// converts input to upper case and extract first char
			String inputStr = in.next().toUpperCase().substring(0, 2);
			playing = true;

			switch (inputStr) {
			case "Q":
				return false;

			case "SC":
			case "PA":
			case "RO":
			case "LI":
			case "SP": {
				lastMove = HandSign.getHandSign(inputStr);
				System.out.println(NAME + " played " + lastMove);
				return true;
			}
			default:
				System.out.println("Invalid input, please try again…");
				playing = false;
			}
		} while (!playing);
		return true;
	}
}
