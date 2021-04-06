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

	ActiveTetromino tetromino;
	int yTran = 0;

	@Override
	public boolean isValid(Board board) {
		tetromino = board.getActiveTetromino();

		while (tetromino.getBoundingBox().getMinY() >= 0) {
			tetromino = tetromino.translate(0, -1);
			if (!board.canPlaceTetromino(tetromino)) {
				tetromino = tetromino.translate(0, +1);
				return true;

			}
		}

		return false;
	}

	@Override
	public Board apply(Board board) {

		board = new Board(board);

		ActiveTetromino a = board.getActiveTetromino();

		board.getActiveTetromino().translate(0, yTran);
		board.placeTetromino(tetromino);
		// board.setActiveTetromino(null);

		return board;

	}

	@Override
	public String toString() {
		return "drop";
	}
}
