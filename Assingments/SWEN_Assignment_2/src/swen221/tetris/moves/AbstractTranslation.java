// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.tetris.moves;

import swen221.tetris.logic.Board;
import swen221.tetris.logic.Rectangle;
import swen221.tetris.tetromino.ActiveTetromino;

/**
 * Implements a translation move.
 *
 * @author David J. Pearce
 * @author Marco Servetto
 *
 */
public abstract class AbstractTranslation extends AbstractMove implements Move {
	/**
	 * Amount to translate x-coordinate.
	 */
	private final int dx;
	/**
	 * Amount to translate y-coordinate.
	 */
	private final int dy;

	/**
	 * Construct new TranslationMove for a given amount of horizontal and vertical
	 * translation.
	 * 
	 * HCeck weather the translation was valid and if not return the current state
	 * of the board
	 *
	 * @param dx Amount to translate in horizontal direction.
	 * @param dy Amount to translate in vertical direction.
	 */
	public AbstractTranslation(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}

	@Override
	public Board apply(Board board) {
		// Create copy of the board to prevent modifying its previous state.
		board = new Board(board);
		// Apply translation for this move
		ActiveTetromino tetromino = board.getActiveTetromino().translate(dx, dy);
		Rectangle bound = tetromino.getBoundingBox();

		// Check the move is not out of bounds
		if (bound.getMinX() < 0 || bound.getMaxX() > board.getWidth() - 1 || bound.getMinY() < 0
				|| !board.canPlaceTetromino(tetromino)) {
			return board;
		}
		// Apply the move to the new board.
		board.setActiveTetromino(tetromino);
		// Return updated version of board
		return board;
	}
}
