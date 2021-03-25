package swen221.adventure.model;

public class LockedDoor extends Door {

	private int code;
	private boolean isLocked = true;

	public LockedDoor(Room oneSide, Room otherSide, int code) {
		super(oneSide, otherSide);
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String[] getActions() {
		return new String[] { "Enter", "Unlock", "Lock", "UnlockWithoutKey" };
	}

	@Override
	public boolean performAction(String action, Player player) {
		Room r = player.getLocation();

		if (action.equals("UnlockWithoutKey")) {
			isLocked = false;
			return true;
		}
		if (action.equals("Enter") && !isLocked) {
			if (r == super.oneSide()) {
				player.setLocation(super.otherSide());
			} else {
				player.setLocation(super.oneSide());
			}
			return true;
		}

		for (Item i : player.getInventory()) {
			if (i instanceof Key) {
				if (((Key) i).getCode() == code) {
					if (action.equals("Lock") || action.equals("Unlock")) {
						isLocked = !isLocked;
						return true;
					}
				}
			}
		}
		return false;
	}
}
