/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

/**
 * Define abstract attributes of players in this game and what behaviors they
 * have.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public abstract class Player {
	
	/**
	 * Player's name in read only field.
	 */
	protected final String NAME;

	/**
	 * Last move this player made - either rock, paper, or scissors. Determines the
	 * winner of round.
	 */
	protected HandSign lastMove;

	/**
	 * How many round wins this player has.
	 */
	protected int wins;

	/**
	 * How many round ties this player has.
	 */
	protected static int ties = 0;

	/**
	 * Public Player constructor. Initializes name and sets wins to 0.
	 * 
	 * @param name sets this player's name.
	 */
	public Player(String name) {
		this.NAME = name;
		wins = 0;
	}

	/**
	 * Public getter method for player's name.
	 * 
	 * @return this player's name.
	 */
	public String getName() {
		return NAME;
	}

	/**
	 * Public getter method for player's last move.
	 * 
	 * @return this player's last move.
	 */
	public HandSign getLastMove() {
		return lastMove;
	}

	/**
	 * Public getter method for player's number of round wins.
	 * 
	 * @return this player's number of round wins.
	 */
	public int getWins() {
		return wins;
	}
	
	// Note: getter for ties property is static.
	/**
	 * Public static getter method for player's number of round ties.
	 * 
	 * @return this player's number of round ties.
	 */
	public static int getTies() {
		return ties;
	}

	/**
	 * Public method to increase player's number of round wins after a
	 * won round.
	 */
	public void win() {
		wins++;
	}
	
	// Note: tie method is static.
	/**
	 * Public method to increase player's number of round ties after a
	 * tie round.
	 */
	public static void tie() {
		ties++;
	}

	/**
	 * Overrides toString method of Object class. Returns this player's name and
	 * their number of wins.
	 */
	@Override
	public String toString() {
		return "Player: " + NAME + "\nWins: " + wins;
	}

	/**
	 * Public abstract method for each player's turn. Logic to be filled in by
	 * classes that extend Player.
	 * 
	 * @return true if turn is successful.
	 */
	public abstract boolean takeTurn();

}
