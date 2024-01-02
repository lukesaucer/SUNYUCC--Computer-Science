package cardgame;

/**
 * 
 * Java class representing a single card from a deck of cards.
 * Returns the face of the card and the suit of the card.
 * 
 * @author Lucas Saucer
 * @since 1-31-21
 * @version 2.0
 */

public class Card {
	private final String face;
	private final String suit;
	
/**
 *  Card constructor to initialize the face and suit of the card.
 *  @param face is set to a card's face value as type String.
 *  @param suit is set to a card's suit value as type String.
 */
	
	public Card(String cardFace,
			    String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
/**
 * @return Used to return a card with the toString method
 * with the face and suit of the card.
 */
	
	public String toString() {
		return face + " of " + suit;
	}

}




