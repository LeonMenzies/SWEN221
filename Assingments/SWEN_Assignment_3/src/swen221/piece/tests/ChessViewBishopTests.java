package swen221.piece.tests;

import org.junit.Test;

import swen221.move.tests.ChessViewTests;

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
		
		//Bishop black takes white piece
		@Test public void bishop_valid_2() {
			String input =
					"h2-h3 b7-b6\n" +
					"Rh1-h2 Bc8-a6\n" +
					"Rh2-h1 Ba6xe2\n" +
					"";
			
			String output =
				"8|r|n|_|q|k|b|n|r|\n" +
				"7|p|_|p|p|p|p|p|p|\n" +
				"6|_|p|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|P|\n" +
				"2|P|P|P|P|b|P|P|_|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
			
		//Bishop black takes white piece
		@Test public void bishop_valid_3() {
			String input =
					"g2-g3 a7-a6\n" +
					"Bf1-h3 a6-a5\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|p|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|P|B|\n" +
				"2|P|P|P|P|P|P|_|P|\n" +
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
		
		//try to move no bishop piece
		@Test public void bishop_invalid_3() {
			String input =
					"Be1-f1\n" +
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
		
		//Bishop take incorrect piece
		@Test public void bishop_valid_4() {
			String input =
					"g2-g3 d7-d6\n" +
					"Bf1-h3 d6-d5\n" +
					"Bh3xQc8\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|_|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|p|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|P|B|\n" +
				"2|P|P|P|P|P|P|_|P|\n" +
				"1|R|N|B|Q|K|_|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
					
	
		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}