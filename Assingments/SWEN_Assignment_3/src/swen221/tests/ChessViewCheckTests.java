package swen221.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;

	public class ChessViewCheckTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//white gets black in check
		@Test public void white_check_1() {
			String input =
					"c2-c3 d7-d6\n" +
					"Qd1-a4+\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|_|p|p|p|p|\n" +
				"6|_|_|_|p|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|Q|_|_|_|_|_|_|_|\n" +
				"3|_|_|P|_|_|_|_|_|\n" +
				"2|P|P|_|P|P|P|P|P|\n" +
				"1|R|N|B|_|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//black gets black in check
		@Test public void black_check_1() {
			String input =
					"f2-f3 e7-e6\n" +
					"f3-f4 Qd8-h4+\n" +
					"";
			
			String output =
				"8|r|n|b|_|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|p|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|P|_|q|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|_|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		

		// ================================================
		// Invalid Tests
		// ================================================

		//False check
		@Test public void invalid_check_1() {
			String input =
					"c2-c3 f7-f6\n" +
					"Qd1-a4+\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|_|p|p|\n" +
				"6|_|_|_|_|_|p|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|P|_|_|_|_|_|\n" +
				"2|P|P|_|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Invalid move
		@Test public void invalid_check_2() {
			String input =
					"Qd1-a4+\n" +
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