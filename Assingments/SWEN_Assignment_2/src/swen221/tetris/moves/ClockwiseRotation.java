// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Implements a rotation move which is either clockwise or anti-clockwise.
 *
 * @author David J. Pearce
 * @author Marco Servetto
 *
 */
public class ClockwiseRotation extends AbstractMove implements Move {

	@Override
	public Board apply(Board board) {
		// Create copy of the board to prevent modifying its previous state.
		board = new Board(board);
		// Create a copy of this board which will be updated.
		ActiveTetromino tetromino = board.getActiveTetromino().rotate(1);

		// Make sure the rotation is valid
		if (!board.canPlaceTetromino(tetromino) || tetromino.getBoundingBox().getMinX() < 0
				|| tetromino.getBoundingBox().getMaxX() > board.getWidth() - 1) {
			return board;
		}
		// Apply the move to the new board, rather than to this board.
		board.setActiveTetromino(tetromino);
		// Return updated version of this board.
		return board;
	}
}
