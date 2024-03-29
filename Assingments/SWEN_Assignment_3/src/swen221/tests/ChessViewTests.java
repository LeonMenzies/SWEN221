package swen221.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;
import swen221.chessview.Position;
import swen221.chessview.Round;
import swen221.chessview.moves.SinglePieceMove;
import swen221.chessview.pieces.Bishop;
import swen221.chessview.pieces.Pawn;

public class ChessViewTests {

	// ================================================
	// Valid Tests
	// ================================================

	@Test public void testValid_01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_02() {
		String input =
			"a2-a3 b7-b6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|p|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_03() {
		String input =
			"a2-a4 b7-b5\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|p|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_04() {
		String input =
			"d2-d4 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|P|p|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_05() {
		String input =
			"d2-d3 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"d3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_06() {
		String input =
			"Nb1-c3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|N|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_07() {
		String input =
			"Nb1-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|N|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_08() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"e2-e4 Nc6xd4\n" +
			"";
		String output =
			"8|r|_|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|n|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_09() {
		String input =
			"Nb1-c3 e7-e5\n" +
			"e2-e3 e5-e4\n" +
			"Nc3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|N|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_10() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_11() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-h4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|B|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_12() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5xe7\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|B|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_13() {
		String input =
			"e2-e4 e7-e5\n" +
			"Qd1-g4 Qd8-h4\n" +
			"Qg4-f4 Qh4-h6\n" +
			"Qf4-f6 Qh6xh2\n" +
			"";
		String output =
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|Q|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|q|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_14() {
		String input =
			"a2-a4 h7-h5\n" +
			"Ra1-a3 Rh8-h6\n" +
			"Ra3-d3 Rh6-g6\n" +
			"Rd3xd7\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|R|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|r|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|_|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	//Test rook take move
	@Test public void testValid_15() {
		String input =
			"h2-h4 g7-g5\n" +
			"h4xg5 h7-h6\n" +
			"Rh1xh6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|_|_|\n" +
			"6|_|_|_|_|_|_|_|R|\n" +
			"5|_|_|_|_|_|_|P|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|_|\n" +
			"1|R|N|B|Q|K|B|N|_|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	//Test rook take rook move
	@Test public void testValid_16() {
		String input =
			"h2-h4 g7-g5\n" +
			"h4xg5 h7-h6\n" +
			"Rh1xh6 Rh8xRh6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|p|p|p|_|_|\n" +
			"6|_|_|_|_|_|_|_|r|\n" +
			"5|_|_|_|_|_|_|P|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|_|\n" +
			"1|R|N|B|Q|K|B|N|_|\n" +
			"  a b c d e f g h";
	
		check(input,output);
	}

	//gamw3.txtx test
	@Test public void testValid() {
		String input =
			"d2-d4 e7-e5\n" +
			"e2-e3 d7-d5\n" +
			"c2-c4 d5xc4\n" +
			"Bf1xc4 Nb8-c6\n" +
			"Ng1-f3 e5-e4\n" +
			"Nf3-d2 f7-f5\n" +
			"Bc4xNg8 Rh8xBg8\n" +
			"O-O Bc8-e6\n" +
			"Qd1-h5+ g7-g6\n" +
			"Qh5xh7 f5-f4\n" +
			"e3xf4 Nc6xd4\n" +
			"Nb1-c3 Bf8-d6\n" + 
			"Nd2xe4 Bd6xf4\n" +
			"g2-g3 Bf4xg3\n" +
			"h2xBg3 Nd4-f3+\n" +
			"Kg1-g2 Nf3-h4+\n"+
			"Qh7xNh4 Qd8xQh4\n" +
			"g3xQh4 g6-g5\n" +
			"Ne4-f6+ Ke8-e7\n" +
			"Nf6xRg8+ Ra8xNg8\n" +
			"h4-h5 g5-g4\n" +
			"h5-h6 Rg8-h8\n" +
			"Rf1-h1 Ke7-f7\n" +
			"Nc3-e4 Rh8-h7\n" +
			"Ne4-g5+ Kf7-g6\n" +
			"Ng5xRh7 Kg6xNh7\n" +
			"";

		String output =
			"8|_|_|_|_|_|_|_|_|\n" +
			"7|p|p|p|_|_|_|_|k|\n" +
			"6|_|_|_|_|b|_|_|P|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|p|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|_|_|_|P|K|_|\n" +
			"1|R|_|B|_|_|_|_|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}

	// ================================================
	// Invalid Tests
	// ================================================

	@Test public void testInvalid_01() {
		String input =
			"a2-a4 a7-a4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	@Test public void testInvalid_02() {
		
		String input =
			"a7-a4\n" +
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
	// StaleMate Tests
	// ================================================
	
	//Stale Mate
	@Test public void stale_mate_invalid_1() {
		
		String input =
				"c2-c3 Ng8-h6\n" +
				"Qd1-a4 Nh6-g8\n" +
				"Qa4xa7 Ng8-h6\n" +
				"Qa7xRa8 Nh6-g8\n" +
				"Qa8xNb8 Ng8-h6\n" +
				"Qb8xb7 Nh6-g8\n" +
				"Qb7xc7 Ng8-h6\n" +
				"Qc7xBc8 f7-f6\n" +
				"a2-a4 Ke8-f7\n" +
				"Qc8xQd8 Kf7-e6\n" +
				"Qd8xBf8 Ke6-d6\n" +
				"Qf8xRh8 Kd6-c7\n" +
				"Qh8xh7 Kc7-b7\n" +
				"Qh7xNh6 Kb7-c8\n" +
				"Qh6xg7 Kc8-b8\n" +
				"Qg7xf6 Kb8-a8\n" +
				"Qf6xe7 Ka8-b8\n" +
				"Qe7xd7 Kb8-a8\n" +
				"Ra1-a3 Ka8-b8\n" +
				"Ra3-b3+ Kb8-a8\n" +
				"g2-g3 Ka8-b8\n" +
			"";
		String output =
			"8|k|_|_|_|_|_|_|_|\n" +
			"7|_|_|_|Q|_|_|_|_|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|R|P|_|_|_|P|_|\n" +
			"2|_|P|_|P|P|P|_|P|\n" +
			"1|_|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	// ================================================
	// Random Tests
	// ================================================
	
	
	//non-check test
	@Test public void random_test_1() {
		
		
		String input =
			"e2-e3 d7-d6\n" +
			"Bf1-b5+ e7-e6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|p|_|_|_|_|\n" +
			"5|_|B|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|N|B|Q|K|_|N|R|\n" +
			"  a b c d e f g h";
		
		check(input,output);
	}
	
	//skip blank lines
	@Test public void random_test_2() {
		
		String input =
			"e2-e3 d7-d6\n" +
			"\n" +
			
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|p|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";
		
		check(input,output);
	}
	
	
	
	// ================================================
	// Position Tests
	// ================================================
	
		//Checking poistion.equals with incorrect object
		@Test public void position_test_1() {			
		assertFalse(new Position(1, 2).equals(new Pawn(false)));
		}
		
		//Invalid position checks
		@Test public void position_test_2() {
									
		assertFalse(new Position(0, 1).isValid());
		assertFalse(new Position(9, 1).isValid());
		assertFalse(new Position(1, 0).isValid());
		assertFalse(new Position(1, 9).isValid());
			
		}
		

	// ================================================
	// Round.java Tests
	// ================================================
		
		
		//check white null move
		@Test public void round_test_1() {	
			
			SinglePieceMove whiteMove = new SinglePieceMove(new Pawn(false), new Position(0, 0), new Position(1, 1));
			SinglePieceMove blackMove = new SinglePieceMove(new Pawn(false), new Position(1, 1), new Position(0, 0));
			Round r1 = new Round(whiteMove, blackMove);
			Round r2 = new Round(whiteMove, null);
			assertEquals(r1.toString(), "`0-a1 a1-`0");
			assertEquals(r2.toString(), "`0-a1");
		}	
		
		
		// ================================================
		// PieceImpl.java Tests
		// ================================================
			
		//Check the equals method of the pieces
		@Test public void piece_empl_test_1() {	
			
			Bishop b = new Bishop(true);
			assertTrue(b.equals(new Bishop(true)));
			assertFalse(b.equals(new Bishop(false)));
			assertFalse(b.equals(new String()));
		}			
			
	

	// The following provides a simple helper method for all tests.
	public static void check(String input, String expectedOutput) {
		try {
			ChessGame game = new ChessGame(input);
			List<Board> boards = game.boards();
			if (boards.isEmpty()) {
				fail("test failed with insufficient boards on input: " + input);
			}
			String actualOutput = boards.get(boards.size() - 1).toString();
			assertEquals(expectedOutput, actualOutput);
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input);
		}
	}
}
