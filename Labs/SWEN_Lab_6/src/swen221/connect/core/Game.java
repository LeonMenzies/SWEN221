// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.connect.core;

import swen221.connect.rules.CaptureRule;
import swen221.connect.rules.ColumnWinRule;
import swen221.connect.rules.RowWinRule;
import swen221.connect.rules.StaleMateRule;
import swen221.connect.util.Position;

/**
 * Represents a game of CONNECT. This includes an internal representation of the
 * game board, and information about the game (e.g. who's turn is it, etc).
 *
 * @author David J. Pearce
 *
 */
public class Game {

	public enum Status {
		STALEMATE, BLACKWON, WHITEWON, ONGOING
	}

	/**
	 * The current state of the board
	 */
	private Board board;

	/**
	 * Counts the total number of moves played during this game. From this, you can
	 * determine who's turn it is to play. You can also determine whether all tokens
	 * have been played (i.e. when moves == 16).
	 */
	private int moves;

	/**
	 * A set of rules which determine what happens in the game. For example, if a
	 * stalemate is reached or a player wins.
	 */
	private Rule[] rules = { new CaptureRule(), new ColumnWinRule(), new RowWinRule(), new StaleMateRule() };

	/**
	 * Indicates the current status of the game. That is, if the game is ongoing or
	 * is over (e.g. because a player won).
	 */
	private Status status;

	private boolean whitesTurn = true;

	/**
	 * Construct a new game from a given starting board.
	 *
	 * @param b
	 */
	public Game(Board b) {
		this.board = b;
		this.status = Status.ONGOING;
	}

	/**
	 * Get the internal board representation of this game.
	 *
	 * @return
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * Get the number of moves played. This is needed for determining when a
	 * stalemate occurs.
	 *
	 * @return
	 */
	public int getMovesPlayed() {
		return moves;
	}

	/**
	 * Get the current status of the game
	 *
	 * @return
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * Place a given token on the board. For this to be accepted, the token must be
	 * appropriate for the player who's turn it currently is.
	 *
	 * @param pos   Position where to place; cannot be null and must be valid board
	 *              position.
	 * @param token Token to place; cannot be null.
	 */
	public void placeToken(Position pos, Board.Token token) {
		if (whitesTurn && token == Board.Token.BLACK) {
			throw new IllegalArgumentException("Illegal move: not black player's turn");
		} else if (!whitesTurn && token == Board.Token.WHITE) {
			throw new IllegalArgumentException("Illegal move: not white player's turn");
		} else if (board.getSquare(pos) != null) {
			throw new IllegalArgumentException("Illegal move: cannot place token on another token");
		} else if (status != Status.ONGOING) {
			throw new IllegalArgumentException("Illegal move: cannot place token after game is over");
		} else if (tokensLeft(token) == 8) {
			throw new IllegalArgumentException("No tokens left");
		}

		board.setSquare(pos, token);
		moves = moves + 1;

		for (Rule rule : rules) {
			status = rule.apply(this);
			if (status != Status.ONGOING) {
				break;
			}
		}
		whitesTurn = !whitesTurn;

	}

	/**
	 * Calculate the number of tokens left for a given player. This is necessary for
	 * checking that a player has not played all of his/her tokens. Remember that
	 * each player only has 8 tokens to start with.
	 *
	 * @param token
	 * @return
	 */
	public int tokensLeft(Board.Token token) {
		if (token == Board.Token.WHITE) {
			// After 1 move, white has moved once.
			// After 3 moves, white has moved twice.
			// ..
			return (moves + 1) / 2;
		} else {
			// After 2 moves, black has moved once
			// after 4 moves, black has moved twice
			// ..
			return moves / 2;
		}
	}
}
