package swen221.chessview.moves;

import swen221.chessview.Board;

public class CheckMate implements Move{
	
	private MultiPieceMove move;

	public CheckMate(MultiPieceMove move) {
		this.move = move;
	}

	public MultiPieceMove move() {
		return move;
	}

	@Override
	public boolean isValid(Board board) {
		if (move.isValid(board)) {

			// First, copy board and apply underlying move.
			board = new Board(board);
			board.apply(move());

			// Second, check opposition is now in checkMate.
			return board.isInCheckMate(!isWhite());
		}
		return false;
	}

	@Override
	public void apply(Board board) {
		move.apply(board);
		
	}

	@Override
	public boolean isWhite() {
		return move.isWhite();
	}
	
	@Override
	public String toString() {
		return move.toString() + "#";
	}

}
