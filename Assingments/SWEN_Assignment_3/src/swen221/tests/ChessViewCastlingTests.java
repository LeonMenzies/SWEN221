

package swen221.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;

	public class ChessViewCastlingTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//White king side castling
		@Test public void white_castling_move_1() {
			String input =
					"Ng1-h3 a7-a6\n" +
					"e2-e3 a6-a5\n" +
					"Bf1-d3 d7-d6\n" +
					"O-O a5-a4\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|_|p|p|p|p|\n" +
				"6|_|_|_|p|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|p|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|B|P|_|_|N|\n" +
				"2|P|P|P|P|_|P|P|P|\n" +
				"1|R|N|B|Q|_|R|K|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
			//White queen side castling
			@Test public void white_castling_move_2() {
				String input =
						"Nb1-a3 h7-h6\n" +
						"d2-d3 h6-h5\n" +
						"Bc1-e3 h5-h4\n" +
						"Qd1-d2 h4-h3\n" +
						"O-O-O\n" +
						"";
				
				String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|p|p|p|_|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|N|_|_|P|B|_|_|p|\n" +
					"2|P|P|P|Q|P|P|P|P|\n" +
					"1|_|_|K|R|_|B|N|R|\n" +
					"  a b c d e f g h";

				check(input,output);
			}
			
			//Black king side castling
			@Test public void black_castling_move_1() {
				String input =
						"a2-a3 Ng8-h6\n" +
						"a3-a4 e7-e5\n" +
						"a4-a5 Bf8-c5\n" +
						"a5-a6 O-O\n" +                         
						"";
				
				String output =
					"8|r|n|b|q|_|r|k|_|\n" +
					"7|p|p|p|p|_|p|p|p|\n" +
					"6|P|_|_|_|_|_|_|n|\n" +
					"5|_|_|b|_|p|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|_|P|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

				check(input,output);
			}
		
			
		//Black queen side castling
		@Test public void black_castling_move_2() {
			String input =
					"h2-h3 Nb8-c6\n" +
					"h3-h4 b7-b5\n" +
					"Rh1-h3 Bc8-a6\n" +
					"Rh3-f3 d7-d5\n" +
					"Rf3-f4 Qd8-d7\n" +
					"Nb1-a3 O-O-O\n" +
					"";
			
			String output =
				"8|_|_|k|r|_|b|n|r|\n" +
				"7|p|_|p|q|p|p|p|p|\n" +
				"6|b|_|n|_|_|_|_|_|\n" +
				"5|_|p|_|p|_|_|_|_|\n" +
				"4|_|_|_|_|_|R|_|P|\n" +
				"3|N|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|_|\n" +
				"1|R|N|B|Q|K|B|K|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
	

		// ================================================
		// Invalid Tests
		// ================================================

		
		



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