package swen221.piece.tests;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;

	public class ChessViewKnightTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//Knight moves and takes
		@Test public void knight_valid_1() {
			String input =
					"Ng1-f3 Nb8-c6\n" +
					"Nf3-d4 Nc6xNd4\n" +
					"Nb1-c3 Nd4-e6\n" +
					"";
			
			String output =
				"8|r|_|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|n|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|N|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|P|\n" +
				"1|R|_|B|Q|K|B|_|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		

	

		// ================================================
		// Invalid Tests
		// ================================================

		//Knight move wrong piece
		@Test public void knight_invalid_1() {
			String input =
					"Nf1-g3\n" +
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
		
		//Knight move to not empty spot
		@Test public void knight_invalid_2() {
			String input =
					"Ng1-g2\n" +
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
		
		//Knight takes incorrect piece
		@Test public void knight_invalid_3() {
			String input =
					"Ng1-f3 a7-a6\n" +
					"Nf3-e5 Ra8-a7\n" +
					"Ne5-g6 Ra7-a8\n" +
					"Ng6xQh8\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|p|p|p|p|p|\n" +
				"6|p|_|_|_|_|_|N|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|_|R|\n" +
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