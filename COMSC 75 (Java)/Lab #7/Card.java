/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 17, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #7 Problem 1
 * 
 * 1. Encapsulate the deck-building code from Section 12.6 in a method called makeDeck that takes no parameters and 
 * returns a fully populated array of Cards. Show me the code output as always. 
 * In order for your code to work, you need to build a class called Card. Use the code we have learned in this class. 
 */

public class Card {
	private String suit;
	private String rank;
	
	public Card(String suit, String rank) {
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
		
			makeDeck(cards);
			
		}
}
