package swen221.cards.variations;

import java.util.List;

import swen221.cards.core.Card;
import swen221.cards.core.Player;
import swen221.cards.util.AbstractCardGame;

public class KnockOutWhist extends AbstractCardGame {
	private int hand = 13;

	public KnockOutWhist() {

	}

	// Constructor for cloning
	public KnockOutWhist(KnockOutWhist cw) {
		super(cw);

	}

	// Clone method
	public KnockOutWhist clone() {
		return new KnockOutWhist(this);
	}

	public String getName() {
		return "Knock-Out Whist";
	}

	public boolean isGameFinished() {
		return hand == 0;
	}

	public void deal(List<Card> deck) {
		currentTrick = null;
		for (Player.Direction d : Player.Direction.values()) {
			players.get(d).getHand().clear();
		}
		Player.Direction d = Player.Direction.NORTH;
		for (int i = 0; i < hand * 4; ++i) {
			Card card = deck.get(i);
			players.get(d).getHand().add(card);
			d = d.next();
		}
	}

	public void endHand() {
		super.endHand();
		hand = hand - 1;
	}
}
