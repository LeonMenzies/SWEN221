package swen221.piece.tests;

import org.junit.Test;

import swen221.move.tests.ChessViewTests;

	public class ChessViewPawnTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//Pawn moves
		@Test public void pawn_valid_1() {
			String input =
					"f2-f4 a7-a5\n" +
					"f4-f5 e7-e5\n" +
					"f5xe6ep d7xe6\n" +
					"b2-b4 a5xb4\n" +
					"b1-b2\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|_|_|p|p|p|\n" +
				"6|_|_|_|_|p|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|p|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|_|P|P|P|_|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		
		

	

		// ================================================
		// Invalid Tests
		// ================================================

		//Pawn move to invalid spot
		@Test public void pawn_invalid_1() {
			String input =
					"e2-e1 c7-c8\n" +
					"c1-d2 a7-b5\n" +
					"h2-g2 f8-f6\n" +
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
		
		//Pawn move to same spot
		@Test public void pawn_invalid_2() {
			String input =
					"c2-c2 e7-e7\n" +
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

		//Pawn move to same spot
		@Test public void pawn_invalid_3() {
			String input =
					"h2-h3 Ng8-h6\n" +
					"Rh1-h2 Nh6-g4\n" +
					"h3xQg4\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|_|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|n|_|\n" +
				"3|_|_|_|_|_|_|_|P|\n" +
				"2|P|P|P|P|P|P|P|R|\n" +
				"1|R|N|B|Q|K|B|N|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Invalid pawn double step
		@Test public void pawn_invalid_4() {
			String input =
					"f2-g4\n" +
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
		
		//Invalid pawn backwards moves
		@Test public void pawn_invalid_5() {
			String input =
					"g2-g4 f7-f6\n" +
					"g4-g2 f6-f7\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|_|p|p|\n" +
				"6|_|_|_|_|_|p|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|P|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|_|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Invalid pawn double step to taken position
		@Test public void pawn_invalid_6() {
			String input =
					"e2-e3 e7-e6\n" +
					"Qd1-g4 e6-e5\n" +
					"g2-g4\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|p|_|_|_|\n" +
				"4|_|_|_|_|_|_|Q|_|\n" +
				"3|_|_|_|_|P|_|_|_|\n" +
				"2|P|P|P|P|_|P|P|P|\n" +
				"1|R|N|B|_|K|B|N|R|\n" +
				"  a b c d e f g h";
            
			check(input,output);
		}
				
		
	

		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}