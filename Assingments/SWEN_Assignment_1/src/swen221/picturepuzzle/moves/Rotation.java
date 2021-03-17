// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.picturepuzzle.moves;

import java.util.Arrays;

import swen221.picturepuzzle.model.Board;
import swen221.picturepuzzle.model.Cell;
import swen221.picturepuzzle.model.Location;
import swen221.picturepuzzle.model.Operation;

/**
 * Responsible for rotating the image data in a given cell in a clockwise
 * direction.
 *
 * @author betty
 *
 */
public class Rotation implements Operation {
	private final Location location;
	private final int steps;

	/**
	 * Construction a rotation for the cell at a given location, rotating a given
	 * number of steps.
	 *
	 * @param loc
	 * @param steps
	 */
	public Rotation(Location loc, int steps) {
		this.location = loc;
		this.steps = steps;
	}

	/**
	 * Apply rotation to the selected cell.
	 *
	 * @param cell  The cell on which the rotation is applied.
	 *
	 * @param steps Number of steps to rotate in clockwise direction.
	 */
	@Override
	public void apply(Board board) {

		Cell c = board.getCellAt(location);

		if (c != null) {
			int w = c.getWidth();
			int[] imageArray = c.getImage();

			int count = 0;
			// Call the rotation method for the amount of steps
			while (count < steps) {
				imageArray = doRotation(imageArray, w);
				count++;
			}
		}
	}

	/**
	 * doRotation takes in the image arrray and uses a nested for loop to iterate
	 * and rotate the image
	 * 
	 * @param m - The image array to be rotated
	 * @param w - The width of the image array
	 * @return - Returns the image array rotated 90 degree
	 */
	public int[] doRotation(int[] m, int w) {

		int[] temp = Arrays.copyOf(m, m.length);

		// Rotation algorithm
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < w; j++) {
				m[w * i + j] = temp[w * (w - 1 - j) + i];

			}
		}

		return m;
	}
}
