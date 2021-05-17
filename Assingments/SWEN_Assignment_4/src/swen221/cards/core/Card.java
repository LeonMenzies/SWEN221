package swen221.cards.core;

public class Card implements Comparable<Card> {

	/**
	 * Represents a card suit.
	 * 
	 * @author David J. Pearce
	 *
	 */
	public enum Suit {
		HEARTS, CLUBS, DIAMONDS, SPADES;
	}

	/**
	 * Represents the different card "numbers".
	 * 
	 * @author David J. Pearce
	 *
	 */
	public enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
	}

	// =======================================================
	// Card stuff
	// =======================================================

	private Suit suit; // HEARTS, CLUBS, DIAMONDS, SPADES
	private Rank rank; // 2 <= number <= 14 (ACE)

	/**
	 * Construct a card in the given suit, with a given number
	 * 
	 * @param suit   --- between 0 (HEARTS) and 3 (SPADES)
	 * @param number --- between 2 and 14 (ACE)
	 */
	public Card(Suit suit, Rank number) {
		this.suit = suit;
		this.rank = number;
	}

	/**
	 * Create a clone of the current card
	 */
	public Card clone() {
		return new Card(suit(), rank());
	}

	/**
	 * Get the suit of this card, between 0 (HEARTS) and 3 (SPADES).
	 * 
	 * @return
	 */
	public Suit suit() {
		return suit;
	}

	/**
	 * Get the number of this card, between 2 and 14 (ACE).
	 * 
	 * @return
	 */
	public Rank rank() {
		return rank;
	}

	private static String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };
	private static String[] ranks = { "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of ", "10 of ",
			"Jack of ", "Queen of ", "King of ", "Ace of " };

	public String toString() {
		return ranks[rank.ordinal()] + suits[suit.ordinal()];
	}

	@Override
	public int compareTo(Card o) {
		int v = suit.compareTo(o.suit);

		if (v == 0) {
			return rank.compareTo(o.rank);
		} else {
			return v;
		}
	}

	// Second compare to for AI find higher
	public int compareTwo(Card o, Card.Suit trump, Card lead) {

		// Check for null case
		if (o == null) {
			return 1;
		}

		// If this card is a trump
		if (this.suit.equals(trump)) {
			// If the other card is also a trump return the highest rank
			if (o.suit.equals(trump)) {
				return this.rank.compareTo(o.rank);
			} else {
				// Else return 1 cos trump always beats other cards
				return 1;
			}
		}

		// If the other card is a trump
		if (o.suit.equals(trump)) {
			// If the this card is also a trump return the highest rank
			if (this.suit.equals(trump)) {
				return o.rank.compareTo(this.rank);
			} else {
				// Else return 1 cos trump always beats other cards
				return -1;
			}
		}

		// If card doesn't follow lead its lower
		if (lead != null) {
			if (this.suit() == lead.suit() && o.suit() != lead.suit())
				return -1;
		}

		// Otherwise compare the rank

		return rank.compareTo(o.rank);

	}

	// Third compare to for AI find lower
	public int compareThree(Card o, Card.Suit trump, Card lead) {

		// Check for null case
		if (o == null) {
			return 1;
		}

		// If this card is a trump
		if (this.suit.equals(trump)) {
			// If the other card is also a trump return the highest rank
			if (o.suit.equals(trump)) {
				return this.rank.compareTo(o.rank);
			} else {
				// Else return 1 cos trump always beats other cards
				return 1;
			}
		}

		// If the other card is a trump
		if (o.suit.equals(trump)) {
			// If the this card is also a trump return the highest rank
			if (this.suit.equals(trump)) {
				return o.rank.compareTo(this.rank);
			} else {
				// Else return 1 cos trump always beats other cards
				return -1;
			}
		}

		// If card doesn't follow lead its lower
		if (lead != null) {
			if (this.suit() == lead.suit() && o.suit() != lead.suit())
				return -1;
		}

		// Otherwise compare the rank

		return rank.compareTo(o.rank);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}

}