package swen221.cards.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Represents a hand of cards held by a player. As the current round proceeds,
 * the number of cards in the hand will decrease. When the round is over, new
 * cards will be delt and added to this hand.
 * 
 * @author David J. Pearce
 * 
 */
public class Hand implements Cloneable, Iterable<Card> {

	private SortedSet<Card> cards = new TreeSet<Card>();

	public Iterator<Card> iterator() {
		return cards.iterator();
	}

	/**
	 * Check with a given card is contained in this hand, or not.
	 * 
	 * @param card
	 * @return
	 */
	public boolean contains(Card card) {
		return cards.contains(card);
	}

	/**
	 * Return all cards in this hand which match the given suit.
	 * 
	 * @param suit
	 * @return
	 */
	public Set<Card> matches(Card.Suit suit) {
		HashSet<Card> r = new HashSet<Card>();
		for (Card c : cards) {
			if (c.suit() == suit) {
				r.add(c);
			}
		}
		return r;
	}

	/**
	 * Clone the current hand and its cards
	 */
	public Hand clone() {
		Hand h = new Hand();

		for (Card c : cards) {
			h.add(c.clone());
		}

		return h;
	}

	/**
	 * Add a card to the hand.
	 */
	public void add(Card card) {
		cards.add(card);
	}

	/**
	 * Remove a card from the hand.
	 */
	public void remove(Card card) {
		cards.remove(card);
	}

	/**
	 * Get number of cards in this hand.
	 * 
	 * @return
	 */
	public int size() {
		return cards.size();
	}

	/**
	 * Remove all cards from this hand.
	 */
	public void clear() {
		cards.clear();
	}

	/**
	 * Return the first card if there is one
	 */
	public Card getFirst() {
		if (cards.size() > 0) {
			return cards.first();
		} else {
			return null;
		}
	}

	/**
	 * returns all the cards
	 */
	public Set<Card> getAll() {
		return cards;
	}
}
