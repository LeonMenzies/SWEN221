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

		
		//Bishop white and black moves
		@Test public void bishop_valid_1() {
			String input =
					"e2-e3 d7-d6\n" +
					"Bf1-c4 Bc8-e6\n" +
					"Bc4xBe6\n" +
					"";
			
			String output =
				"8|r|n|_|q|k|b|n|r|\n" +
				"7|p|p|p|_|p|p|p|p|\n" +
				"6|_|_|_|p|B|_|_|_|\n" +
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

		//Bishop cant move sideways
		@Test public void bishop_invalid_1() {
			String input =
					"Bf1-e1\n" +
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
		
		//Bishop no move
		@Test public void bishop_invalid_2() {
			String input =
					"Bf1-f1\n" +
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