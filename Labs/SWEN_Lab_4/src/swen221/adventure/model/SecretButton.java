package swen221.adventure.model;

import java.awt.Color;
import java.awt.Graphics;

public class SecretButton implements Item {

	int code;

	public SecretButton(int code) {
		this.code = code;
	}

	@Override
	public String getDescription() {
		return "A Secret button";
	}

	@Override
	public String[] getActions() {
		return new String[] { "Press" };

	}

	@Override
	public boolean performAction(String action, Player player) {
		if (action.equals("Press")) {
			for (Room.Location l : Room.Location.values()) {
				if (player.getLocation().getItem(l) instanceof LockedDoor) {
					LockedDoor ld = (LockedDoor) player.getLocation().getItem(l);
					if (ld.getCode() == code) {
						ld.performAction("UnlockWithoutKey", player);
					}
				}
			}
		}
		return false;
	}

	@Override
	public void draw(Graphics g) {
		int width = (int) g.getClipBounds().getWidth() / 2;
		int height = (int) g.getClipBounds().getHeight() / 2;
		int xStart = width / 4;
		int yStart = height / 4;
		int xEnd = (width * 3) / 4;
		int yEnd = (height * 3) / 4;
		g.setColor(Color.RED);
		g.fillOval(xStart, yStart, xEnd - xStart, yEnd - yStart);
		g.setColor(Color.RED.darker());
		g.fillOval(xStart + 5, yStart + 5, (xEnd - 10) - xStart, (yEnd - 10) - yStart);
		g.setColor(Color.BLACK);
		g.drawOval(xStart, yStart, xEnd - xStart, yEnd - yStart);

	}

}
