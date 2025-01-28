/*
 * Niklas Feil-Ho
 * ID# 1057122
 * January 17, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #7 Problem 1
 * 
 * 2. In section 13.2, these following 3 methods are not finished. Your task is to finish these 3 methods. 
 * Remember that you need to write a main method to test that these 3 methods are working correctly. 
One way to do that is to print out a deck of 52 cards from the first card to the last
Then shuffle the deck of 52 cards
Then print out the 52 cards again. The second printout needs to be different from the first printout. 
 */
public class Problem2 {
	private String suit;
	private String rank;
	
	public Problem2(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public String toString() {
		return suit + " of " + rank;
	}
		
				
	public static void makeDeck(Card[] cards) {
		for(Card card : cards) {
			System.out.println(card);
		}
	}
	
	public static void shuffle( Card[] cards) {
	    for (int i = 0; i < cards.length; i++) {
	    	int randomIndex = randomInt(i,cards.length -1);
	    	swapCards(i, randomIndex, cards	);
	        // choose a random number between i and length - 1
	        // swap the ith card and the randomly-chosen card
	    }
	}

	private static int randomInt(int low, int high) {
		return low + (int) (Math.random() * (high - low + 1));
	    // return a random number between low and high,
	    // including both
	}

	private static void swapCards(int i, int j, Card[] cards) {
		Card temporary = cards[i];
		cards[i] = cards[j];
		cards[j] = temporary;
	    // swap the ith and the jth cards in the array
	}

	public static void main(String[] args) {
		String []suits = { "Clubs", "Diamonds", "Hearts", "Spades"}; 
		String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Jack", "Queen", "King"};
		
		Card[] cards = new Card[52];
		int index = 0;
		for (int suitIndex = 0; suitIndex <= 3; suitIndex++) {
			for (int rankIndex = 1; rankIndex <= 13; rankIndex++) {
				cards [index] = new Card(ranks[rankIndex],suits[suitIndex]);
				index++;
			}
	}
		if (cards[0] == null) {
			System.out.println("No card yet");
		}
			
			Problem2.shuffle(cards);
		
		
			makeDeck(cards);
			
		}
}
