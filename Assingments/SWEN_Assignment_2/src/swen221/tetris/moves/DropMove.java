// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Implements a "hard drop". That is, when the tetromino is immediately dropped
 * all the way down as far as it can go.
 *
 * @author David J. Pearce
 * @author Marco Servetto
 *
 */
public class DropMove implements Move {

	@Override
	public boolean isValid(Board board) {

		// Make sure there is an active tetromino to drop
		if (board.getActiveTetromino() == null) {
			return false;
		}

		return true;
	}

	@Override
	public Board apply(Board board) {
		// Create copy of the board to prevent modifying its previous state.
		board = new Board(board);
		// Create a copy of this board which will be updated.
		ActiveTetromino tetromino = board.getActiveTetromino();

		// Move the tetromino down until its not valid
		while (board.canPlaceTetromino(tetromino)) {
			tetromino = tetromino.translate(0, -1);
		}

		// Move it up 1 so it is valid and set it
		tetromino = tetromino.translate(0, +1);
		board.setActiveTetromino(tetromino);
		// Return updated version of this board.
		return board;
	}

	@Override
	public String toString() {
		return "drop";
	}
}
