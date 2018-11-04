/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

/**
 * Define class property number of players and the methods that need
 * to be implemented by all classes that use this interface.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public interface Playable {

	
	/**
	 * Define number of players in this game.
	 */
	public static final int NUM_PLAYERS = 2;
	// What is the access level of this property? Is it a class or instance
	// property? Answer: Public and it is a constant. Class property.
	
	
	// What is the access level of these methods? Are they abstract or
	// concrete? Answer: Public. All interface members are public. All abstract
	// because the don't have implementation details. The classes that implement
	// this interface will fill in the details.
	/**
	 * Initialize all players in this game.
	 */
	public void initPlayers();
	
	/**
	 * Begin playing this game. 
	 */
	public void play();

	/**
	 * Evaluate round results and determine round winner.
	 */
	public void evaluateRound();

	/**
	 * Display results of the round and current wins/ties for each player.
	 */
	public void displayResults();

}
