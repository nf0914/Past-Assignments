/* * Niklas Feil-Haw
 * ID# 1057122
 * January 15, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #6 Problem 1
 * 
 * 1. Chapter 11-2

In the board game Scrabble, each tile contains a letter, which is used to spell words in rows and columns, and a score, 
which is used to determine the value of words. The point of this exercise is to practice the mechanical part of creating a new class definition:

Write a definition for a class named Tile that represents Scrabble tiles. 
The instance variables should include a character named letter and an integer named value.
Write a constructor that takes parameters named letter and value, and initializes the instance variables.
Write a method named printTile that takes a Tile object as a parameter and displays the instance variables in a reader-friendly format.
Write a main method that creates a Tile object with the letter Z and the value 10, and then uses printTile to display the state of the object.
 * 
 */
public class Tile {
	
	private char letter;
	private int value;
	
	public Tile (char letter, int value ) {
		this.letter = letter;
		this.value = value;
	}
	
	public void printTile () {
		System.out.println("Tile letter: " + letter);
		System.out.println("Tile value: " + value);
	}

	public static void main(String[] args) {
		Tile scrabble = new Tile('Z',10);
		
		scrabble.printTile();
				
	}

}
