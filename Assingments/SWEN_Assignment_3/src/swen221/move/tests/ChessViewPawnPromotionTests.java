



package swen221.move.tests;

import org.junit.Test;

	public class ChessViewPawnPromotionTests {

		// ================================================
		// Valid Tests
		// ================================================

		
		//White promotion to knight
		@Test public void whitepawn_promotion_1() {
			String input =
					"f2-f4 g7-g5\n" +
					"f4xg5 Ng8-f6\n" +
					"g5-g6 e7-e6\n" +
					"g6-g7 e6-e5\n" +
					"g7-g8=N\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|N|r|\n" +
				"7|p|p|p|p|_|p|_|p|\n" +
				"6|_|_|_|_|_|n|_|_|\n" +
				"5|_|_|_|_|p|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|_|P|P|\n" +
				"1|R|N|B|Q|K|B|N|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//White promotion to rook
				@Test public void whitepawn_promotion_2() {
					String input =
							"f2-f4 g7-g5\n" +
							"f4xg5 Ng8-f6\n" +
							"g5-g6 e7-e6\n" +
							"g6-g7 e6-e5\n" +
							"g7-g8=R\n" +
							"";
					
					String output =
						"8|r|n|b|q|k|b|R|r|\n" +
						"7|p|p|p|p|_|p|_|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|_|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

					check(input,output);
				}
				//White promotion to bishop
				@Test public void whitepawn_promotion_3() {
					String input =
							"f2-f4 g7-g5\n" +
							"f4xg5 Ng8-f6\n" +
							"g5-g6 e7-e6\n" +
							"g6-g7 e6-e5\n" +
							"g7-g8=B\n" +
							"";
					
					String output =
						"8|r|n|b|q|k|b|B|r|\n" +
						"7|p|p|p|p|_|p|_|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|_|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

					check(input,output);
				}
				//White promotion to king
				@Test public void whitepawn_promotion_4() {
					String input =
							"f2-f4 g7-g5\n" +
							"f4xg5 Ng8-f6\n" +
							"g5-g6 e7-e6\n" +
							"g6-g7 e6-e5\n" +
							"g7-g8=K\n" +
							"";
					
					String output =
						"8|r|n|b|q|k|b|K|r|\n" +
						"7|p|p|p|p|_|p|_|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|_|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

					check(input,output);
				}
				//White promotion to queen
				@Test public void whitepawn_promotion_5() {
					String input =
							"f2-f4 g7-g5\n" +
							"f4xg5 Ng8-f6\n" +
							"g5-g6 e7-e6\n" +
							"g6-g7 e6-e5\n" +
							"g7-g8=Q\n" +
							"";
					
					String output =
						"8|r|n|b|q|k|b|Q|r|\n" +
						"7|p|p|p|p|_|p|_|p|\n" +
						"6|_|_|_|_|_|n|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|_|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

					check(input,output);
				}
				
				//Black promotion to queen
				@Test public void blackpawn_promotion_1() {
					String input =
							"g2-g4 f7-f5\n" +
							"Ng1-h3 f5xg4\n" +
							"Nh3-f4 g4-g3\n" +
							"Nf4-h3 g3-g2\n" +
							"Nh3-f4 g2-g1=Q\n" +
							"";
					
					String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|N|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|_|P|\n" +
						"1|R|N|B|Q|K|B|q|R|\n" +
						"  a b c d e f g h";

					check(input,output);
				}		
		
		
		
		

		// ================================================
		// Invalid Tests
		// ================================================

		//Trying to premote piece not at end of board
		@Test public void invalid_pawn_promotion_1() {
			String input =
					"g2-g4 f7-f5\n" +
					"Ng1-h3 f5xg4\n" +
					"Nh3-f4 g4-g3\n" +
					"Nf4-h3 g3-g2=Q\n" +
					
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|r|\n" +
				"7|p|p|p|p|p|_|p|p|\n" +
				"6|_|_|_|_|_|_|_|_|\n" +
				"5|_|_|_|_|_|_|_|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|p|N|\n" +
				"2|P|P|P|P|P|P|_|P|\n" +
				"1|R|N|B|Q|K|B|_|R|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Trying to premote no pawn piece
		@Test public void invalid_pawn_promotion_2() {
			String input =
					"h2-h4 g7-g5\n" +
					"h4xg5 h7-h6\n" +
					"Rh1xh6 Rh8-h7\n" +
					"Rh6xRh7 e7-e6\n" +
					"Rh7-h8=Q\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|_|\n" +
				"7|p|p|p|p|_|p|_|R|\n" +
				"6|_|_|_|_|p|_|_|_|\n" +
				"5|_|_|_|_|_|_|P|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|_|\n" +
				"1|R|N|B|Q|K|B|N|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		
		//Trying invalid move
		@Test public void invalid_pawn_promotion_3() {
			String input =
					"h2-h4 g7-g5\n" +
					"h4xg5 h7-h6\n" +
					"Rh1xh6 Rh8-h7\n" +
					"Rh6xRh7 e7-e6\n" +
					"Rh7-g8=Q\n" +
					"";
			
			String output =
				"8|r|n|b|q|k|b|n|_|\n" +
				"7|p|p|p|p|_|p|_|R|\n" +
				"6|_|_|_|_|p|_|_|_|\n" +
				"5|_|_|_|_|_|_|P|_|\n" +
				"4|_|_|_|_|_|_|_|_|\n" +
				"3|_|_|_|_|_|_|_|_|\n" +
				"2|P|P|P|P|P|P|P|_|\n" +
				"1|R|N|B|Q|K|B|N|_|\n" +
				"  a b c d e f g h";

			check(input,output);
		}
		



		//Use the main ChessViewTest class to compare the input and outputs
		public static void check(String input, String expectedOutput) {
			new ChessViewTests();
			ChessViewTests.check(input, expectedOutput);
		}
	}