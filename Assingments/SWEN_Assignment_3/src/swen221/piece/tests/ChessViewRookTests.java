package swen221.piece.tests;

import org.junit.Test;

import swen221.tests.ChessViewTests;

	public class ChessViewRookTests {

		// ================================================
		// Invalid Tests
		// ================================================

		//Rook invalid move to taken spot
		@Test public void rook_invalid_1() {
			String input =
					"Rh1-h2\n" +
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
		
		//Move invalid Rook
		@Test public void rook_invalid_2() {
			String input =
					"Rg1-g2\n" +
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
		
		//Rook diagonal move
		@Test public void rook_invalid_3() {
			String input =
					"g2-g3 h7-h6\n" +
					"Rh1-f3\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|p|p|p|_|\n" +
					"6|_|_|_|_|_|_|_|p|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|P|_|\n" +
					"2|P|P|P|P|P|P|_|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Rook take invalid piece
		@Test public void rook_invalid_4() {
			String input =
					"h2-h4 g7-g5\n" +
					"h4xg5 Ng8-h6\n" +
					"Rh1xRh6\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|_|r|\n" +
					"7|p|p|p|p|p|p|_|p|\n" +
					"6|_|_|_|_|_|_|_|n|\n" +
					"5|_|_|_|_|_|_|P|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|P|P|P|_|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
					

		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}