

package swen221.move.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import swen221.chessview.moves.Castling;
import swen221.tests.ChessViewTests;

	public class ChessViewCastlingTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//White king side castling
		@Test public void castling_move_1() {
			String input =
					"Ng1-h3 a7-a6\n" +
					"e2-e3 a6-a5\n" +
					"Bf1-d3 d7-d6\n" +
					"O-O a5-a4\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|_|p|p|p|p|\n" +
				"6|_|_|_|p|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|p|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|B|P|_|_|N|\n" +
				"2|P|P|P|P|_|P|P|P|\n" +
				"1|R|N|B|Q|_|R|K|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//White queen side castling
		@Test public void castling_move_2() {
			String input =
					"Nb1-a3 h7-h6\n" +
					"d2-d3 h6-h5\n" +
					"Bc1-e3 h5-h4\n" +
					"Qd1-d2 h4-h3\n" +
					"O-O-O\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|_|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|N|_|_|P|B|_|_|p|\n" +
				"2|P|P|P|Q|P|P|P|P|\n" +
				"1|_|_|K|R|_|B|N|R|\n" +
				"  a b c d e f g h";
	
			check(input,output);
		}
		
		//Black king side castling
		@Test public void castling_move_3() {
			String input =
					"a2-a3 Ng8-h6\n" +
					"a3-a4 e7-e5\n" +
					"a4-a5 Bf8-c5\n" +
					"a5-a6 O-O\n" +                         
					"";
			
			String output =
				"8|r|n|b|q|_|r|k|_|\n" +
				"7|p|p|p|p|_|p|p|p|\n" +
				"6|P|_|_|_|_|_|_|n|\n" +
				"5|_|_|b|_|p|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|_|P|P|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";
	
			check(input,output);
		}
		
			
		//Black queen side castling
		@Test public void castling_move_4() {
			String input =
					"h2-h3 Nb8-c6\n" +
					"h3-h4 b7-b5\n" +
					"Rh1-h3 Bc8-a6\n" +
					"Rh3-f3 d7-d5\n" +
					"Rf3-f4 Qd8-d7\n" +
					"Nb1-a3 O-O-O\n" +
					"";
			
			String output =
				"8|_|_|k|r|_|b|n|r|\n" +
				"7|p|_|p|q|p|p|p|p|\n" +
				"6|b|_|n|_|_|_|_|_|\n" +
				"5|_|p|_|p|_|_|_|_|\n" +
				"4|_|_|_|_|_|R|_|P|\n" +
				"3|N|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|_|\n" +
				"1|R|_|B|Q|K|B|N|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Black king side castling into check
		@Test public void castling_move_5() {
			String input =
					"f2-f4 g7-g5\n" +
					"f4xg5 f7-f6\n" +
					"g5xf6 Ke8-f7\n" +
					"Ng1-h3 Kf7xf6\n" +
					"g2-g3 Kf6-f5\n" +
					"Bf1-g2 Kf5-f6\n" +
					"O-O+\n" +
					"";
			
			String output =
				"8|r|n|b|q|_|b|n|r|\n" +
				"7|p|p|p|p|p|_|_|p|\n" +
				"6|_|_|_|_|_|k|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|P|N|\n" +
				"2|P|P|P|P|P|_|B|P|\n" +
				"1|R|N|B|Q|_|R|K|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Black queen side castling into check
		@Test public void castling_move_6() {
			String input =
					"d2-d3 e7-e6\n" +
					"Bc1-e3 Ke8-e7\n" +
					"Nb1-a3 Ke7-d6\n" +
					"Qd1-d2 a7-a6\n" +
					"Qd2-a5 b7-b6\n" +
					"d3-d4 c7-c6\n" +
					"d4-d5 b6xQa5\n" +
					"g2-g3 Kd6xd5\n" +
					"O-O-O+\n" +
					"";
			
			String output =
				"8|r|n|b|q|_|b|n|r|\n" +
				"7|_|_|_|p|_|p|p|p|\n" +
				"6|p|_|p|_|p|_|_|_|\n" +
				"5|p|_|_|k|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|N|_|_|_|B|_|P|_|\n" +
				"2|P|P|P|_|P|P|_|P|\n" +
				"1|_|_|K|R|_|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
	

		// ================================================
		// Invalid Tests
		// ================================================

		
		//Invalid king side castle
		@Test public void invalid_castling_move_1() {
			String input =
					"O-O\n" +
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
		
		//Invalid queen side castle
		@Test public void invalid_castling_move_2() {
			String input =
					"O-O-O\n" +
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
		
		//Invalid king side castle black
		@Test public void invalid_castling_move_3() {
			String input =
					"Ng1-h3 O-O" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|N|\n" +
				"2|P|P|P|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|_|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//Invalid queen side castle black
		@Test public void invalid_castling_move_4() {
			String input =
					"Ng1-h3 O-O-O" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|N|\n" +
				"2|P|P|P|P|P|P|P|P|\n" +
				"1|R|N|B|Q|K|B|_|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//Invalid castle piece
		@Test public void invalid_castling_move_5() {
			String input =
					"d2-d3 a7-a6\n" +
					"Nb1-d2 Ra8-a7\n" +
					"Ra1-b1 Ra7-a8\n" +
					"Nd2-b3 Ra8-a7\n" +
					"Nb3-a1 Ra7-a8\n" +
					"O-O-O\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|p|p|p|p|p|\n" +
				"6|p|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|P|_|_|_|_|\n" +
				"2|P|P|P|_|P|P|P|P|\n" +
				"1|N|R|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//King moved
		@Test public void invalid_castling_move_6() {
			String input =
					"e2-e4 d7-d6\n" +
					"Ke1-e2 Qd8-d7\n" +
					"O-O\n" +
					"";
			
			String output =
				"8|r|n|b|_|k|b|n|r|\n" +
				"7|p|p|p|q|p|p|p|p|\n" +
				"6|_|_|_|p|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|P|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|K|P|P|P|\n" +
				"1|R|N|B|Q|_|B|N|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//Rook moved
		@Test public void invalid_castling_move_7() {
			String input =
					"h2-h3 h7-h6\n" +
					"Rh1-h2 g7-g6\n" +
					"O-O\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|p|_|_|\n" +
				"6|_|_|_|_|_|_|p|p|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|P|\n" +
				"2|P|P|P|P|P|P|P|R|\n" +
				"1|R|N|B|Q|K|B|N|_|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//Not a king in the king spot
		@Test public void invalid_castling_move_8() {
			String input =
					"e2-e3 a7-a6\n" +
					"Ke1-e2 a6-a5\n" +
					"Qd1-e1 a5-a4\n" +
					"O-O\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|p|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|P|_|_|_|\n" +
				"2|P|P|P|P|K|P|P|P|\n" +
				"1|R|N|B|_|Q|B|N|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//King has moved
		@Test public void invalid_castling_move_10() {
			String input =
					"e2-e3 e7-e6\n" +
					"Ke1-e2 f7-f6\n" +
					"Ke2-e1 d7-d6\n" +
					"Bf1-e2 c7-c6\n" +
					"Ng1-h3 b7-b6\n" +
					"O-O\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|_|_|_|_|_|p|p|\n" +
				"6|_|p|p|p|p|p|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|P|_|_|N|\n" +
				"2|P|P|P|P|B|P|P|P|\n" +
				"1|R|N|B|Q|K|_|_|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
		
		//Rook has moved
		@Test public void invalid_castling_move_11() {
			String input =
					"Ng1-h3 a7-a6\n" +
					"g2-g3 a6-a5\n" +
					"Bf1-g2 a5-a4\n" +
					"Rh1-g1 a4-a3\n" +
					"Rg1-h1 Ra8-a4\n" +
					"O-O\n" +
					"";
			
			String output =
				"8|_|n|b|q|k|b|n|r|\n" +
				"7|_|p|p|p|p|p|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|r|_|_|_|_|_|_|_|\n" +
				"3|p|_|_|_|_|_|P|N|\n" +
				"2|P|P|P|P|P|P|B|P|\n" +
				"1|R|N|B|Q|K|_|_|R|\n" +
				"  a b c d e f g h";
			check(input,output);
		}
					
				
		// ================================================
		// Test toString
		// ================================================
		
		//king side toString
		@Test public void test_toString_1() {
		
			Castling c = new Castling(true, true);
			assertEquals(c.toString(), "O-O");
		
		}
		//queen side toString
		@Test public void test_toString_2() {
		
			Castling c = new Castling(true, false);
			assertEquals(c.toString(), "O-O-O");
		
		}


		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}