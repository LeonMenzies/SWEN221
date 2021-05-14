package swen221.tests;

import java.io.IOException;

import org.junit.Test;

import swen221.chessview.ChessGame;
import swen221.chessview.Round;

public class ChessViewExceptionTests {
	
	//check white null move
	@Test public void exception_test_1() {	
		
		try {
			new Round(null, null);
		} catch (IllegalArgumentException e) {}
	}	
	
	//Invalid castling input
	@Test public void exception_test_2() throws IOException {	
		
		String input =
				"O\n" +
				"";
		
		try {
			ChessGame game = new ChessGame(input);
		} catch (IllegalArgumentException e) {}
	}
	
	//Invalid sheet input no "-"
	@Test public void exception_test_3() throws IOException {	
		
		String input =
				"e7e6\n" +
				"";
		
		try {
			ChessGame game = new ChessGame(input);
		} catch (IllegalArgumentException e) {}
	}	

	//Invalid pawn promotion
	@Test public void exception_test_4() throws IOException {	
		
		String input =
				"e7-e6=S\n" +
				"";
		
		try {
			ChessGame game = new ChessGame(input);
		} catch (IllegalArgumentException e) {}
	}	
	
	//Invalid sheet length
	@Test public void exception_test_5() throws IOException {	
		
		String input =
				"e7-e6g" +
				"";
		
		try {
			ChessGame game = new ChessGame(input);
		} catch (IllegalArgumentException e) {}
	}	
	
}
	