package swen221.adventure.model;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class represents a book in the game
 * 
 * @author menzieleon
 *
 */
public class Book extends PickupableItem {

	String title;
	boolean read;

	public Book(String t) {
		read = false;
		this.title = t;
	}

	@Override
	public boolean performAction(String action, Player player) {
		if (action.equals("Read")) {
			if (player.getInventory().contains(this)) {
				this.read = true;
				return true;
			} else {
				return false;
			}
		} else if (action.equals("Pickup")) {
			return super.performAction(action, player);
		} else if (action.equals("Drop")) {
			return super.performAction(action, player);
		} else {
			throw new IllegalArgumentException("Unknown action: " + action);
		}

	}

	@Override
	public String getDescription() {
		if (read) {
			return "A book entitled \"" + title + "\"; it looks like it has been read";
		} else {
			return "A book entitled \"" + title + "\"";
		}
	}

	@Override
	public String[] getActions() {
		return new String[] { "Pickup", "Drop", "Read" };
	}

	@Override
	public void draw(Graphics g) {
		int width = (int) g.getClipBounds().getWidth();
		int height = (int) g.getClipBounds().getHeight();
		int xStart = width / 4;
		int yStart = height / 8;
		int xEnd = (width * 3) / 4;
		int yEnd = (height * 7) / 8;
		g.setColor(Color.CYAN);
		g.fillRect(xStart, yStart, xEnd - xStart, yEnd - yStart);
		g.setColor(Color.BLACK);
		g.drawRect(xStart, yStart, xEnd - xStart, yEnd - yStart);
		g.fillRect(xStart + 10, height / 3, 10, 10);

	}

}
