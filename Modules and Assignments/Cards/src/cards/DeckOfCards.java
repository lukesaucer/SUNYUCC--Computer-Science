package cards;

import java.security.SecureRandom;

public class DeckOfCards {
	
	private static final SecureRandom randomNumbers =
			new SecureRandom();
	private static final int NUMBER_OF_CARDS = 52;
	private Card[] deck = new Card[NUMBER_OF_CARDS];

	public DeckOfCards() {
		String[] faces = {"A", "2", "3", "4", "5",
				"6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// build the deck
		for (int count =0; count < deck.length; count++) {
			deck[count] =
				new Card(faces[count % 13], suits[count / 13]);
		}
		
		for (int count=0; count < deck.length; count++) {
			System.out.printf("%s%n", deck[count]);
		}
	}
	
	public void shuffle() {
		int currentCard = 0;
		
		for (int first=0; first < deck.length; first++) {
			// generate a random # from 0 - 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		} // finished shuffling
		
		// print the shuffled deck
		//for (int count=0; count < deck.length; count++) {
		for (Card card : deck)
			System.out.printf("%s%n", card);		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Card card1 = new Card("King","Diamonds");
		//Card card2 = new Card("Jack","Hearts");
		
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle(); // shuffle the deck
		
		
		//System.out.printf("Card1: %s%n", card1);
		//System.out.printf("Card2: %s%n", card2);

	}

}