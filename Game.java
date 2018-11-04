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
 * Define attributes of this game, such as number of rounds, an array of
 * players, and scanner for inputting player's name. Implements Playable
 * interface
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public abstract class Game implements Playable {

	/**
	 * Number of rounds this game will last.
	 */
	protected int numRounds;

	/**
	 * Array of concrete players in this game.
	 */
	protected Player[] players;
	
	
	/**
	 * Scanner for inputting player's name(s).
	 */
	protected Scanner in;

	/**
	 * Public Game constructor. Initializes players, number of rounds, number of
	 * players, and scanner for input.
	 * 
	 * @param numRounds number of rounds in this game.
	 */
	public Game(int numRounds) {
		this.numRounds = numRounds;
		this.players = new Player[NUM_PLAYERS];
		this.in = new Scanner(System.in);

		// How can the Game class invoke the method initPlayers without getting an
		// error, if it has not yet been defined?
		// Answer: It's part of the interface so it knows I have to implement it.
		initPlayers();
	}

	/**
	 * Overrides finalize method of the Object class. Tries to invoke close method
	 * of Scanner object. If Exception is caught, nothing happens
	 */
	@Override
	public void finalize() {
		try {
			in.close();
		} catch (Exception e) {

		}
	}
}
