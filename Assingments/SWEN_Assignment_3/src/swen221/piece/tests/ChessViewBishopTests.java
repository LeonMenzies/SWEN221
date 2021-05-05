package swen221.piece.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;

	public class ChessViewBishopTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//White king side castling
		@Test public void bishop_valid_1() {
			String input =
					"e2-e3 b7-b6\n" +
					"Bf1-a6 Bc8xBa6\n" +
					"";
			
			String output =
				"8|r|n|_|q|k|b|n|r|\n" +
				"7|p|_|p|p|p|p|p|p|\n" +
				"6|b|p|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|P|_|_|_|\n" +
				"2|P|P|P|P|_|P|P|P|\n" +
				"1|R|N|B|Q|K|_|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		
	

		// ================================================
		// Invalid Tests
		// ================================================
		
		//test if bishops can move past peices
		@Test public void bishop_invalid_1() {
		    String input =
		        "a2-a4 Bf8-c5\n" +
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
		//test if bishop can move it straight line through peice
		@Test public void bishop_invalid_2() {
		    String input =
		        "a2-a4 Bf8-f6\n" +
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

		//test if bishop can move it straight line 
		@Test public void bishop_invalid_3() {
		    String input =
		        "a2-a4 f7-f5\n" +
		        "d2-d4 Bf8-f6\n"+
		        "";
		    String output =
		        "8|r|n|b|q|k|b|n|r|\n" +
		        "7|p|p|p|p|p|_|p|p|\n" +
		        "6|_|_|_|_|_|_|_|_|\n" +
		        "5|_|_|_|_|_|p|_|_|\n" +
		        "4|P|_|_|P|_|_|_|_|\n" +
		        "3|_|_|_|_|_|_|_|_|\n" +
		        "2|_|P|P|_|P|P|P|P|\n" +
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