package swen221.move.tests;

import org.junit.Test;

import swen221.tests.ChessViewTests;

	public class ChessViewCheckMateTests {

		// ================================================
		// Valid Tests
		// ================================================

		//black gets white in check mate
		@Test public void white_check_mate_1() {
			String input =
					"f2-f3 e7-e5\n" +
					"g2-g4 Qd8-h4#\n" +
					"";
			
			String output =
				"8|r|n|b|_|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|p|_|_|_|\n" +
				"4|_|_|_|_|_|_|P|q|\n" +
				"3|_|_|_|_|_|P|_|_|\n" +
				"2|P|P|P|P|P|_|_|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}

		// ================================================
		// Invalid Tests
		// ================================================

		//False check
		@Test public void invalid_check_mate_1() {
			String input =
					"c2-c3#\n" +
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

		//False check move
		@Test public void invalid_check_mate_2() {
			String input =
					"c2-c9#\n" +
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

		//King can get out of check
		@Test public void invalid_check_mate_3() {
			String input =
					"f2-f3 e7-e5\n" +
					"a2-a3 Qd8-h4#\n" + 
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|p|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|P|_|_|_|_|P|_|_|\n" +
				"2|_|P|P|P|P|_|P|P|\n" +
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