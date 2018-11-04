/*
 * Name: Adam Mohr
 * Student ID: 040669681
 * Course & Section: CST8132 301
 * Assignment: Lab 5
 * Date: Oct 26, 2018
 */

package rps;

/**
 * Define concrete behavior for game of rock, paper, scissors. Initializes players,
 * starts the game, and evaluates round winners while displaying results.
 * Subclass of Game.
 * 
 * @author Adam Mohr
 * @version 1.0
 * @since 1.8
 */

public class RockPaperScissors extends Game {

	/**
	 * public constructor for RockPaperScissors. Initializes game with number of
	 * rounds calling super constructor inherited from Game.
	 * 
	 * @param numRounds number of rounds to play in this game.
	 */
	public RockPaperScissors(int numRounds) {
		super(numRounds);
	}

	/** 
	 * Initialize game with players - human and computer.
	 */
	public void initPlayers() {
		System.out.print("Enter player's name: ");
		// Human is the zeroth element and the Computer is the first element in array of
		// players.
		players[0] = new Human(in);
		players[1] = new Computer();
	}

	/**
	 * For loop decides how many rounds to play based on the input of numRounds.
	 * Check to see if human player takes turn or not.
	 * Call evaluate round method.
	 */
	public void play() {
		for (int i = 0; i < numRounds; i++) {
			if (!players[0].takeTurn()) {
				break;
			}
			players[1].takeTurn();

			evaluateRound();
		}
	}

	/** 
	 * Process HandSign moves and decide winner of round.
	 */
	public void evaluateRound() {
		// Get players last moves.
		HandSign[] moves = new HandSign[] { players[0].getLastMove(), players[1].getLastMove() };

		// Local variable to decide the winner of round.
		int winner = HandSign.getWinner(moves);

		// Condition for tie in the round.
		if (winner == -1) {
			Player.tie();
			System.out.println("It’s a tie! Ties: " + Player.ties);
		}

		// Condition for human to win the round.
		else if (winner == 0) {
			System.out.print(players[0].getLastMove() + " beats " + players[1].getLastMove() + "! ");
			System.out.println(players[0].getName() + " wins!");
			players[0].win();
		} else {
			// If we get this far and above conditions are not true, then computer has won
			// the round.
			System.out.print(players[1].getLastMove() + " beats " + players[0].getLastMove() + "! ");
			System.out.println(players[1].getName() + " wins!");
			players[1].win();
		}
	}

	/** 
	 * Print results of previous round to standard output.
	 */
	public void displayResults() {
		Player winner = null;

		for (Player player : players) {
			// Output players implicitly using toString method.
			System.out.println(player);
			
			// Condition to win the entire game.
			if (player.getWins() > numRounds / 2) {
				winner = player;
				System.out.println("The winner is " + winner + "!");
			}
		}

		System.out.println("Ties: " + Player.getTies());
		
		// Condition for tie game.
		if (winner == null) {
			System.out.println("It's a tie game!");
		}
		System.out.println("Thanks for playing Rock, Paper, Scissors, Lizard, Spock. Bye!");
	}
}
