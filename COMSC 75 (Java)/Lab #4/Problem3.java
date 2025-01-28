/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 11, 2024
 * COMSC-075
 * Prof. Ho
 * Lab 4 Problem 2
 * 3. A word is said to be “abecedarian” if the letters in the word appear in alphabetical order. 
 * For example, the following are all six-letter English abecedarian words:

abdest, acknow, acorsy, adempt, adipsy, agnosy, befist, behint, beknow, bijoux, biopsy, cestuy, chintz, 
deflux, dehors, dehort, deinos, diluvy, dimpsy


Write a method called isAbecedarian that takes a String and returns a boolean indicating whether the word is abecedarian.

Hint:

- If the word is one letter long, it is always abecedarian
- If the word is longer than one letter long, you compare the second letter to the first letter. 
If the second letter < first letter, you are done and the word is not abecedarian
- Use String methods charAt, compareTo, substring

Some starter code that will help is here (Using this is optional)

      String f;
      String rest;
      int diff; 
      boolean status = true;     // status is true as long as it is abcedarian

      for (int i = 0; i < s.length()-1; i++) {
         f = s.charAt (i) + "";       // This gets the letter at i
         rest = s.substring(i+1);      // This gets the rest of the letters
         diff = f.compareTo(rest);      // Now your compare f to rest
         // if diff is negative, it is still abcedarian
         // As soon as diff is not negative, change status to false
* 
*/
import java.util.Scanner;

public class Problem3 {
	
	public static boolean isAbecedarian(String str) {
		boolean Indication = true; 
		
		for (int i = 0; i < str.length() - 1; i++) {
			String f = str.charAt(i) + ""; //This gets the letter at i
			String rest = str.substring(i+1); //This gets the rest of the letters
			int diff = f.compareTo(rest);  //Now you compare f to rest
			// if diff is negative, it is still abecedarian
			// As soon as diff is not negative, change status to false
			
			if (diff > 0) {
				Indication = false;
				break;
			}
		}
		return Indication;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String Word = input.nextLine();
		
		boolean result = isAbecedarian(Word);
		
		System.out.println("Is the word \"" + Word + "\" abecedarian?: " + result);
		}
}
