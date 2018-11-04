/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

/**
 * Define which objects to create and methods to call on objects. Main method.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public class PlayGame {

	/**
	 * Program starts here. Start game of rock, paper, scissors.
	 * 
	 * @param args Optional command line arguments may be used.
	 */
	public static void main(String[] args) {
		// Start a new game of rock, paper, scissor, lizard, spock with 3 rounds. 
		Playable game = new RockPaperScissors(3);
		game.play();
		game.displayResults();
		
		// Elevator Statement: RockPaperScissor extends Game which implements Playable.
		// Both Human and Computer classes extend the abstract Player class.
		// Finally, the PlayGame class doesn't interact with any other classes but it
		// contains the main method where this program starts.
	}
}
