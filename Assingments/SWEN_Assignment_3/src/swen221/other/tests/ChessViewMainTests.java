package swen221.other.tests;

import org.junit.Test;

import swen221.chessview.ChessGame;

public class ChessViewMainTests {

	
	//Invalid sheet length
		@Test public void main_test_1() throws Exception {	
			
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
			
			ChessGame game = new ChessGame(input);
			
			//Main m = new Main(game);
			    
		}
}
