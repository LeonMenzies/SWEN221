package swen221.piece.tests;


import org.junit.Test;

import swen221.move.tests.ChessViewTests;

	public class ChessViewQueenTests {


		// ================================================
		// Invalid Tests
		// ================================================

		//Queen invalid move to invalid spot
		@Test public void queen_invalid_1() {
			String input =
					"Qh1-h2\n" +
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
		
		//Queen take invalid piece
		@Test public void queen_invalid_2() {
			String input =
					"e2-e3 d7-d6\n" +
					"Qd1-g4 d6-d5\n" +
					"Qg4xQc8\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|_|p|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|p|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|Q|_|\n" +
					"3|_|_|_|_|P|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
					"1|R|N|B|_|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Queen move to not empty spot
		@Test public void queen_invalid_3() {
			String input =
					"Qd1-e2\n" +
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
				
		

		

		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}