package swen221.cards.util;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import swen221.cards.core.Card;
import swen221.cards.core.Hand;
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

		// Useful fields
		Card toReturn = null;
		Hand hand = player.getHand();
		List<Card> played = trick.getCardsPlayed();

		Card.Suit trump = trick.getTrumps();
		Card lead = trick.getCardPlayed(trick.getLeadPlayer());

		Set<Card> leadCards = new HashSet<>();

		// Get the winning played card
		Card winningCard = null;
		for (Card c2 : played) {
			if (c2.compareTwo(winningCard) > 0) {
				winningCard = c2;
			}

		}
//
//		// No cards played, play best card
//		if (played.size() == 0) {
//
//			for (Card toCheck : hand.getAll()) {
//				if (toCheck.compareTwo(toReturn, trump, lead) >= 0) {
//					toReturn = toCheck;
//				}
//			}
//
//			return toReturn;
//
//			// Play minimum card to win
//		} else if (played.size() == 3) {
//
//			Card bestPlay = null;
//
//			for (Card c3 : hand.getAll()) {
//				if (c3.compareTwo(winningCard, trump, lead) > 0) {
//
//					if (bestPlay == null) {
//						bestPlay = c3;
//					} else {
//						if (c3.compareTwo(bestPlay, trump, lead) < 0) {
//							bestPlay = c3;
//						}
//					}
//				}
//			}
//
//			return bestPlay;
//			// Iterate the played cards and and play best one to beat everyone
//			// If not possible get rid of worst card
//		} else {
//
//			Card bestPlay = null;
//
//			for (Card toCheck : hand.getAll()) {
//				if (toCheck.compareTwo(bestPlay, trump, lead) >= 0) {
//					bestPlay = toCheck;
//				}
//			}
//
//			if (bestPlay.compareTwo(winningCard, trump, lead) >= 0) {
//				return bestPlay;
//			} else {
//				Card lowestCard = bestPlay;
//				for (Card toCheck : hand.getAll()) {
//					if (toCheck.compareThree(lowestCard, trump, lead) <= 0) {
//						lowestCard = toCheck;
//					}
//				}
//				return lowestCard;
//			}
//		}
	}
}
