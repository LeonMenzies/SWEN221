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
	 * Create a clone of the current card using the current suite and rank
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

	/**
	 * @param o - Card to be compared to this
	 * @return the value of the comparison
	 * 
	 *         Second compare to for AI find higher rank then suit
	 */
	public int compareTwo(Card o) {
		int v = rank.compareTo(o.rank);

		if (v == 0) {
			return suit.compareTo(o.suit);
		} else {
			return v;
		}

	}

	/**
	 * Stand Java hashCode method
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	/**
	 * Standard Java equals method
	 */
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
