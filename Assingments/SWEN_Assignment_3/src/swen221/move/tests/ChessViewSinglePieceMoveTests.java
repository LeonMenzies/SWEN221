package swen221.move.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import swen221.chessview.Position;
import swen221.chessview.moves.SinglePieceMove;
import swen221.chessview.pieces.Bishop;
import swen221.chessview.pieces.King;
import swen221.chessview.pieces.Knight;
import swen221.chessview.pieces.Pawn;
import swen221.chessview.pieces.Queen;
import swen221.chessview.pieces.Rook;
import swen221.tests.ChessViewTests;

	public class ChessViewSinglePieceMoveTests {

		// ================================================
		// Invalid Tests
		// ================================================

		//invalid single piece old position
		@Test public void single_piece_move_invalid_test_1() {
		
		
		String input =
			"e9-e6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
		}
		
		//invalid single piece new position
		@Test public void single_piece_move_invalid_test_2() {
		
		
		String input =
			"e6-e9\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
		}


		// ================================================
		// single piece moves
		// ================================================
		
		@Test public void single_piece_toString_1() {
			
			SinglePieceMove left = new SinglePieceMove(new Pawn(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "`0-`0");
			
		}
		
		@Test public void single_piece_toString_2() {
			
			SinglePieceMove left = new SinglePieceMove(new Knight(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "N`0-`0");
			
		}

		@Test public void single_piece_toString_3() {
			
			SinglePieceMove left = new SinglePieceMove(new Bishop(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "B`0-`0");
			
		}
		
		@Test public void single_piece_toString_4() {
			
			SinglePieceMove left = new SinglePieceMove(new Rook(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "R`0-`0");
			
		}
		
		@Test public void single_piece_toString_5() {
			
			SinglePieceMove left = new SinglePieceMove(new Queen(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "Q`0-`0");
			
		}
		
		@Test public void single_piece_toString_6() {
			
			SinglePieceMove left = new SinglePieceMove(new King(true), new Position(0, 0), new Position(0, 0));		
			assertEquals(left.toString(), "K`0-`0");
			
		}
		

		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}