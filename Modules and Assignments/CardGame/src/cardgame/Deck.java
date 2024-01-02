package cardgame;

import java.security.SecureRandom;

/**
 * 
 * Java class representing a deck of cards.
 * Allows for the player and dealer to receive a card
 * from the deck at random.
 * 
 * @author Lucas Saucer
 * @since 1-31-21
 * @version 2.0
 * 
 * Creates a deck of cards with face and suit values.
 * Sets variable currentCard to a card drawn at random
 * from the deck.
 */

public class Deck {
	private static final SecureRandom 
	   randomNumbers = new SecureRandom();
	private static final int NUMBER_OF_CARDS=52;
	private Card[] deck = 
			new Card[NUMBER_OF_CARDS];	
	private int currentCard = 0;
	

	public Deck() {
		String faces[] = {"Ace","2","3","4","5",
				"6","7","8","9","10","J","Q","K"};
		String suits[] = {"Hearts","Dimonds",
				"Clubs","Spades"};
		for (int count = 0; count <deck.length;count++)
			deck[count]= new Card(faces[count % 13 ],
								  suits[count / 13]);
	}	
/**
 * 
 * @param index selects a card from the deck using
 * the getCard method.
 * @return returns a card from the deck as type String.
 */
	public Card getCard(int index) {
		return deck[index];
	}
	
	public String toString() {
		String str = "";
		for (int count =0; count < deck.length; count++)
			str = str + deck[count].toString() + " ";
		return str;
	}
	
	/**
	 * Creates method to shuffle the cards in the deck.
	 */
	
	public void shuffle() {
		currentCard = 0;
		
		for (int first=0; first < deck.length; first++) {
			// pick a random card
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			// swap current card with the random card
			Card temp = deck[first];  // temp copy
			deck[first] = deck[second];
			deck[second] = temp;
		}
		
	}

}





