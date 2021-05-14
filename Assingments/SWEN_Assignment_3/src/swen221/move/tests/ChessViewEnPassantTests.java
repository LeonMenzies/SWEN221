package swen221.move.tests;

import org.junit.Test;

import swen221.tests.ChessViewTests;

	public class ChessViewEnPassantTests {

		// ================================================
		// Valid Tests
		// ================================================

		//Check that white enpassant works
		@Test public void en_passant_1() {
			String input =
					"Ng1-h3 e7-e5\n" +
					"c2-c3 e5-e4\n" +
					"f2-f4 e4xf3ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|_|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|P|_|_|p|_|N|\n" +
					"2|P|P|_|P|P|_|P|P|\n" +
					"1|R|N|B|Q|K|B|_|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Check that black enpassant works
		@Test public void en_passant_2() {
			String input =
					"e2-e4 a7-a6\n" +
					"e4-e5 d7-d5\n" +
					"e5xd6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|_|p|p|_|p|p|p|p|\n" +
					"6|p|_|_|P|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		

		// ================================================
		// Invalid Tests
		// ================================================

		//Check that no double step works
		@Test public void en_passant_invalid_1() {
			String input =
					"d2-d4 e7-e6\n" +
					"d4-d5 e6-e5\n" +
					"d5xe6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|_|p|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|P|p|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|_|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Check that enpassant on non pawn doesnt work
		@Test public void en_passant_invalid_2() {
			String input =
					"b2-b4 e7-e6\n" +
					"b4-b5 Bf8-c5\n" +
					"b5xc6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|_|n|r|\n" +
					"7|p|p|p|p|_|p|p|p|\n" +
					"6|_|_|_|_|p|_|_|_|\n" +
					"5|_|P|b|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|_|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Check that enpassant when move to is not empty
		@Test public void en_passant_invalid_3() {
			String input =
					"b2-b4 e7-e6\n" +
					"b4-b5 Bf8-c5\n" +
					"g2-g3 c7-c6\n" +
					"b5xc6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|_|n|r|\n" +
					"7|p|p|_|p|_|p|p|p|\n" +
					"6|_|_|p|_|p|_|_|_|\n" +
					"5|_|P|b|_|_|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|P|_|\n" +
					"2|P|_|P|P|P|P|_|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Check that enpassant when to be taken is empty
		@Test public void en_passant_invalid_4() {
			String input =
					"b2-b4 e7-e6\n" +
					"b4xc5ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|_|p|p|p|\n" +
					"6|_|_|_|_|p|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|P|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|_|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Check that enpassant when to be taken is same color
		@Test public void en_passant_invalid_5() {
			String input =
					"b2-b4 e7-e6\n" +
					"a2-a4 g7-g6\n" +
					"a4xb5ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|_|p|_|p|\n" +
					"6|_|_|_|_|p|_|p|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|P|P|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|_|_|P|P|P|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//Invalid final postion
		@Test public void en_passant_invalid_6() {
			String input =
					"e2-e4ep b8-b7ep\n" +
					"h1-e4ep h7-h6ep\n" +
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
		
		//En passant at wrong place
		@Test public void en_passant_invalid_7() {
			String input =
					"e2-e3 f7-f5\n" +
					"e3-e4 f5-f4\n" +
					"e4xf5ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|p|p|p|p|p|_|p|p|\n" +
					"6|_|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|_|_|_|\n" +
					"4|_|_|_|_|P|p|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//En passant at wrong distance
		@Test public void en_passant_invalid_8() {
			String input =
					"e2-e3 a7-a6\n" +
					"e3-e4 f7-f5\n" +
					"e4xf6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|_|p|p|p|p|_|p|p|\n" +
					"6|p|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|_|_|p|_|_|\n" +
					"4|_|_|_|_|P|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//En passant wrong new column
		@Test public void en_passant_invalid_9() {
			String input =
					"e2-e4 a7-a6\n" +
					"e4-e5 d7-d5\n" +
					"e5xe6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|_|p|p|_|p|p|p|p|\n" +
					"6|p|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|p|P|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
					"1|R|N|B|Q|K|B|N|R|\n" +
					"  a b c d e f g h";

			check(input,output);
		}
		
		//En passant wrong new column
		@Test public void en_passant_invalid_10() {
			String input =
					"e2-e4 a7-a6\n" +
					"e4-e5 d7-d5\n" +
					"e5xe6ep\n" +
					"";
			
			String output =
					"8|r|n|b|q|k|b|n|r|\n" +
					"7|_|p|p|_|p|p|p|p|\n" +
					"6|p|_|_|_|_|_|_|_|\n" +
					"5|_|_|_|p|P|_|_|_|\n" +
					"4|_|_|_|_|_|_|_|_|\n" +
					"3|_|_|_|_|_|_|_|_|\n" +
					"2|P|P|P|P|_|P|P|P|\n" +
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