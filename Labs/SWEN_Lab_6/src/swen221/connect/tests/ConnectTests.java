// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.connect.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import swen221.connect.core.Board;
import swen221.connect.core.Board.Token;
import swen221.connect.core.Game;
import swen221.connect.util.Position;

public class ConnectTests {

	@Test
	public void test_01() {
		String output = "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n";

		Board board = new Board();

		assertEquals(output, board.toString());
	}

	@Test
	public void test_02() {

		String output = "|W|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(0, 0), Token.WHITE);

		assertEquals(output, board.toString());

	}

	@Test
	public void test_03() {

		String output = "|W|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|B|_|_|_|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(0, 0), Token.WHITE);
		game.placeToken(new Position(0, 3), Token.BLACK);

		assertEquals(output, board.toString());

	}

	@Test
	public void test_04() {

		String output = "|W|_|_|W|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(0, 0), Token.WHITE);
		game.placeToken(new Position(2, 0), Token.BLACK);
		game.placeToken(new Position(3, 0), Token.WHITE);

		assertEquals(output, board.toString());

	}

	@Test
	public void test_05() {

		String output = "|_|B|_|_|\n" + "|_|_|_|_|\n" + "|_|_|_|_|\n" + "|_|B|_|W|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(3, 3), Token.WHITE);
		game.placeToken(new Position(1, 0), Token.BLACK);
		game.placeToken(new Position(1, 2), Token.WHITE);
		game.placeToken(new Position(1, 3), Token.BLACK);

		assertEquals(output, board.toString());

	}

	@Test
	public void test_06() {

		String output = "|_|_|_|_|\n" + "|_|B|_|_|\n" + "|_|_|_|_|\n" + "|_|B|_|W|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(3, 3), Token.WHITE);
		game.placeToken(new Position(1, 1), Token.BLACK);
		game.placeToken(new Position(1, 2), Token.WHITE);
		game.placeToken(new Position(1, 3), Token.BLACK);

		assertEquals(output, board.toString());

	}

	@Test
	public void test_07() {

		String output = "|W|W|W|W|\n" + "|_|_|_|_|\n" + "|_|_|B|_|\n" + "|_|_|B|B|\n";

		Board board = new Board();
		Game game = new Game(board);

		game.placeToken(new Position(0, 0), Token.WHITE);
		game.placeToken(new Position(3, 3), Token.BLACK);
		game.placeToken(new Position(3, 0), Token.WHITE);
		game.placeToken(new Position(2, 2), Token.BLACK);
		game.placeToken(new Position(2, 0), Token.WHITE);
		game.placeToken(new Position(2, 3), Token.BLACK);
		game.placeToken(new Position(1, 0), Token.WHITE);

		assertEquals(output, board.toString());

	}

}
