/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

import java.util.Random;

/**
 * Define attributes and behavior for the computer player in this game.
 * Subclass of Player. Default name is HAL.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public class Computer extends Player {

	// Would it be possible to use the implicit default constructor of the Computer
	// class? Answer: No because super needs to be explicitly called.
	// Implicit super constructor Player() is undefined for default constructor.
	// Must define an explicit constructor is what the compiler says.
	
	/**
	 * Public constructor for Computer. Explicitly calls super method inherited from
	 * Player and initializes computer's name as HAL.
	 */
	public Computer() {
		super("HAL");
	}

	/**
	 * Public boolean method that contains logic for a successful turn in this game.
	 * 
	 * @return true if turn executes successfully.
	 */
	public boolean takeTurn() {

		// What type of variable is this? What is the scope of this variable? Does it
		// require Javadoc – why or why not?
		// Answer - Local. No, because it is not an instance variable and its scope ends
		// when you leave takeTurn.
		Random random = new Random();

		// Generate random values for the game of rock, paper, scissors from 3 enums in
		// HandSign.
		lastMove = HandSign.values()[random.nextInt(5)];

		System.out.println(NAME + ", it’s your turn!");

		System.out.println(NAME + " played " + lastMove);

		return true;
	}
}
