package swen221.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.Test;

import swen221.chessview.Board;
import swen221.chessview.ChessGame;

public class ChessViewTests {

	// ================================================
	// Valid Tests
	// ================================================

	@Test public void testValid_01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_02() {
		String input =
			"a2-a3 b7-b6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|p|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_03() {
		String input =
			"a2-a4 b7-b5\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|p|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_04() {
		String input =
			"d2-d4 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|P|p|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_05() {
		String input =
			"d2-d3 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"d3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_06() {
		String input =
			"Nb1-c3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|N|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_07() {
		String input =
			"Nb1-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|N|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_08() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"e2-e4 Nc6xd4\n" +
			"";
		String output =
			"8|r|_|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|n|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_09() {
		String input =
			"Nb1-c3 e7-e5\n" +
			"e2-e3 e5-e4\n" +
			"Nc3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|N|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_10() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_11() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-h4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|B|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_12() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5xe7\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|B|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_13() {
		String input =
			"e2-e4 e7-e5\n" +
			"Qd1-g4 Qd8-h4\n" +
			"Qg4-f4 Qh4-h6\n" +
			"Qf4-f6 Qh6xh2\n" +
			"";
		String output =
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|Q|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|q|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_14() {
		String input =
			"a2-a4 h7-h5\n" +
			"Ra1-a3 Rh8-h6\n" +
			"Ra3-d3 Rh6-g6\n" +
			"Rd3xd7\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|R|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|r|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|_|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	
	//White king side castling
	@Test public void white_castling_move_1() {
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
		@Test public void white_castling_move_2() {
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
		@Test public void black_castling_move_1() {
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
	@Test public void black_castling_move_2() {
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
			"1|R|N|B|Q|K|B|K|_|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	
	//NEW TESTS
	@Test public void testValid_16() {
		String input =
				"d2-d4 e7-e5\n" +
				"e2-e3 d7-d5\n" +
				"c2-c4 d5xc4\n" +
				"Bf1xc4 Nb8-c6\n" +
				"Ng1-f3 e5-e4\n" +
				"Nf3-d2 f7-f5\n" +
				"Bc4xNg8 Rh8xBg8\n" +
				"O-O Bc8-e6\n" +
				"Qd1-h5+ g7-g6\n" +
				"Qh5xh7 f5-f4\n" +
				"e3xf4 Nc6xd4\n" +
				"Nb1-c3 Bf8-d6\n" + 
				"Nd2xe4 Bd6xf4\n" +
				"g2-g3 Bf4xg3\n" +
				"h2xBg3 Nd4-f3+\n" +
				"Kg1-g2 Nf3-h4+\n"+
				"Qh7xNh4 Qd8xQh4\n" +
				"g3xQh4 g6-g5\n" +
				"Ne4-f6+ Ke8-e7\n" +
				"Nf6xRg8+ Ra8xNg8\n" +
				"h4-h5 g5-g4\n" +
				"h5-h6 Rg8-h8\n" +
				"Rf1-h1 Ke7-f7\n" +
				"Nc3-e4 Rh8-h7\n" +
				"Ne4-g5+ Kf7-g6\n" +
				"Ng5xRh7 Kg6xNh7\n" +
				"";

		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|R|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|r|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|_|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}

	// ================================================
	// Invalid Tests
	// ================================================

	@Test public void testInvalid_01() {
		String input =
			"a2-a4 a7-a4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	

	
	//test if bishops can move past peices
	@Test public void bishopInvalid1() {
	    String input =
	        "a2-a4 Bf8-c5\n" +
	        "";
	    String output =
	        "8|r|n|b|q|k|b|n|r|\n" +
	        "7|p|p|p|p|p|p|p|p|\n" +
	        "6|_|_|_|_|_|_|_|_|\n" +
	        "5|_|_|_|_|_|_|_|_|\n" +
	        "4|P|_|_|_|_|_|_|_|\n" +
	        "3|_|_|_|_|_|_|_|_|\n" +
	        "2|_|P|P|P|P|P|P|P|\n" +
	        "1|R|N|B|Q|K|B|N|R|\n" +
	        "  a b c d e f g h";

	    check(input,output);
	}
	//test if bishop can move it straight line through peice
	@Test public void bishopInvalid2() {
	    String input =
	        "a2-a4 Bf8-f6\n" +
	        "";
	    String output =
	        "8|r|n|b|q|k|b|n|r|\n" +
	        "7|p|p|p|p|p|p|p|p|\n" +
	        "6|_|_|_|_|_|_|_|_|\n" +
	        "5|_|_|_|_|_|_|_|_|\n" +
	        "4|P|_|_|_|_|_|_|_|\n" +
	        "3|_|_|_|_|_|_|_|_|\n" +
	        "2|_|P|P|P|P|P|P|P|\n" +
	        "1|R|N|B|Q|K|B|N|R|\n" +
	        "  a b c d e f g h";

	    check(input,output);
	}

	//test if bishop can move it straight line 
	@Test public void bishopInvalid3() {
	    String input =
	        "a2-a4 f7-f5\n" +
	        "d2-d4 Bf8-f6\n"+
	        "";
	    String output =
	        "8|r|n|b|q|k|b|n|r|\n" +
	        "7|p|p|p|p|p|_|p|p|\n" +
	        "6|_|_|_|_|_|_|_|_|\n" +
	        "5|_|_|_|_|_|p|_|_|\n" +
	        "4|P|_|_|P|_|_|_|_|\n" +
	        "3|_|_|_|_|_|_|_|_|\n" +
	        "2|_|P|P|_|P|P|P|P|\n" +
	        "1|R|N|B|Q|K|B|N|R|\n" +
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

//"8|r|n|b|q|k|b|n|r|\n" +
//"7|p|p|p|p|p|p|p|p|\n" +
//"6|_|_|_|_|_|_|_|_|\n" +
//"5|_|_|_|_|_|_|_|_|\n" +
//"4|_|_|_|_|_|_|_|_|\n" +
//"3|_|_|_|_|_|_|_|_|\n" +
//"2|P|P|P|P|P|P|P|P|\n" +
//"1|R|N|B|Q|K|B|N|R|\n" +
//"  a b c d e f g h";