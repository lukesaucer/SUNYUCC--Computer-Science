package cardgame;

import java.util.Scanner;

/**
 * Java class representing a card game.
 * Prints the dealer's hand and the player's hand.
 * Allows user to input a bet.
 * 
 * @author Lucas Saucer
 * @since 1-31-21
 * @version 2.0
 * 
 */

public class CardGame {

	/**
	 * Main deals out a card at random from the deck to
	 * both the player and the dealer.
	 * User is allowed to place a bet on the game.
	 *
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Card firstCard = new Card("Two","Hearts");
		Scanner input = new Scanner (System.in);
		//System.out.println(firstCard);
		Deck deck = new Deck();
		deck.shuffle();
		// Deal a Hand of five Cards
		System.out.println("Dealer's Hand:");
		System.out.println(deck.getCard(0));
		System.out.println(deck.getCard(1));
		System.out.println(deck.getCard(2));
		System.out.println("Player's Hand:");
		System.out.println(deck.getCard(3));
		System.out.println(deck.getCard(4));
		System.out.println("Make a Bet!");
		String s = input.next();
		System.out.println("Dealer's Card:");
		System.out.println(deck.getCard(5));
		System.out.println("Make a Bet!");
		s = input.next();
		System.out.println("Dealer's Card:");
		System.out.println(deck.getCard(6));
		//System.out.println(deck);
	}

}
