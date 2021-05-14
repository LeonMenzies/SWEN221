package swen221.piece.tests;

import org.junit.Test;

import swen221.tests.ChessViewTests;

	public class ChessViewKingTests {

		// ================================================
		// Valid Tests
		// ================================================
	
		//King diagonal move
		@Test public void king_valid_1() {
			String input =
					"f2-f3 d7-d6\n" +
					"Ke1-f2 Ke8-d7\n" +
					"";
			
			String output =
				"8|r|n|b|q|_|b|n|r|\n" +
				"7|p|p|p|k|p|p|p|p|\n" +
				"6|_|_|_|p|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|P|_|_|\n" +
				"2|P|P|P|P|P|K|P|P|\n" +
				"1|R|N|B|Q|_|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//King white take moves
		@Test public void king_valid_2() {
			String input =
					"f2-f3 d7-d6\n" +
					"Ke1-f2 Ke8-d7\n" +
					"Kf2-g3 g7-g5\n" +
					"Kg3-g4 d6-d5\n" +
					"Kg4xg5 Ng8-f6\n" +
					"Kg5-f4 Nf6-h5+\n" +
					"Kf4-g4 Kd7-d6+\n" +
					"Kg4xNh5 c7-c6\n" +
					"Kh5-h4 Kd6-c7\n" +
					"";
			
			String output =
				"8|r|n|b|q|_|b|_|r|\n" +
				"7|p|p|k|_|p|p|_|p|\n" +
				"6|_|_|p|_|_|_|_|_|\n" +
				"5|_|_|_|p|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|K|\n" +
				"3|_|_|_|_|_|P|_|_|\n" +
				"2|P|P|P|P|P|_|P|P|\n" +
				"1|R|N|B|Q|_|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
				
		// ================================================
		// Invalid Tests
		// ================================================

		//King invalid move to taken spot
		@Test public void king_invalid_1() {
			String input =
					"Ke1-d1\n" +
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
		
		//King invalid diagonal move
		@Test public void king_invalid_2() {
			String input =
					"Ke1-f2\n" +
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
		
		
		//move piece that is not actually a king piece
		@Test public void king_invalid_3() {
			String input =
					"Kf2-f3" +
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
		
		//King white take moves
		@Test public void king_invalid_4() {
			String input =
					"f2-f3 d7-d6\n" +
					"Ke1-f2 Ke8-d7\n" +
					"Kf2-g3 g7-g5\n" +
					"Kg3-g4 d6-d5\n" +
					"Kg4xg5 Ng8-f6\n" +
					"Kg5-f4 Nf6-h5+\n" +
					"Kf4-g4 Kd7-d6+\n" +
					"Kg4xQh5" +		
					"";
			
			String output =
				"8|r|n|b|q|_|b|_|r|\n" +
				"7|p|p|p|_|p|p|_|p|\n" +
				"6|_|_|_|k|_|_|_|_|\n" +
				"5|_|_|_|p|_|_|_|n|\n" +
				"4|_|_|_|_|_|_|K|_|\n" +
				"3|_|_|_|_|_|P|_|_|\n" +
				"2|P|P|P|P|P|_|P|P|\n" +
				"1|R|N|B|Q|_|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}

		
		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}