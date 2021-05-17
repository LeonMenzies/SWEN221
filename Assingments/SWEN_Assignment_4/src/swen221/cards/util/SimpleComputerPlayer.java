package swen221.cards.util;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Comparator;
import java.util.TreeSet;

import swen221.cards.core.Card;
import swen221.cards.core.Player;
import swen221.cards.core.Trick;

/**
 * Implements a simple computer player who plays the highest card available when
 * the trick can still be won, otherwise discards the lowest card available. In
 * the special case that the player must win the trick (i.e. this is the last
 * card in the trick), then the player conservatively plays the least card
 * needed to win.
 * 
 * @author David J. Pearce
 * 
 */
public class SimpleComputerPlayer extends AbstractComputerPlayer {

	public SimpleComputerPlayer(Player player) {
		super(player);
	}

	@Override
	public Card getNextCard(Trick trick) {

		// Check hand is not empty
		if (player.getHand().size() == 0) {
			fail("Hand is empty");
		}

		Card toReturn = null;

		// Collections
		TreeSet<Card> allCards = new TreeSet<>(new CardComapre());
		TreeSet<Card> leadCards = new TreeSet<>(new CardComapre());
		TreeSet<Card> nonTrumpCards = new TreeSet<>(new CardComapre());
		TreeSet<Card> trumpCards = new TreeSet<>(new CardComapre());
		TreeSet<Card> tableaCards = new TreeSet<>(new CardComapre());

		for (Card c : player.getHand().getAll()) {
			// Add each card
			allCards.add(c);
			// add matching to lead
			Card check = trick.getCardPlayed(trick.getLeadPlayer());
			if (check != null && c.suit() == check.suit()) {
				leadCards.add(c);
			}
			if (c.suit() != trick.getTrumps()) {
				nonTrumpCards.add(c);
			}
			// Add matching to trump
			if (c.suit() == trick.getTrumps()) {
				trumpCards.add(c);
			}
		}

		// Order the table to find the highest
		for (Card c : trick.getCardsPlayed()) {
			tableaCards.add(c);
		}

		// Play best card
		if (trick.getCardsPlayed().isEmpty()) {
			if (trick.getTrumps() != null && trumpCards.isEmpty() == false) {
				toReturn = trumpCards.last();
			} else {
				toReturn = allCards.last();
			}
			// Play lowest card to win
		} else if (trick.getCardsPlayed().size() == 3) {
			for (Card c : allCards) {
				if (c.compareTwo(tableaCards.last()) > 0) {
					toReturn = c;
					break;
				}
			}
			// Throw worst card
		} else {
			if (nonTrumpCards.isEmpty()) {
				toReturn = allCards.first();
			} else {
				toReturn = nonTrumpCards.first();
			}
		}

		return toReturn;

	}
}

//Comparator class
class CardComapre implements Comparator<Card> {

	@Override
	public int compare(Card c1, Card c2) {
		int v = c1.rank().compareTo(c2.rank());

		if (v == 0) {
			return c1.suit().compareTo(c2.suit());
		} else {
			return v;
		}
	}
}
