/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 20, 2024
 * COMSC-075
 * Prof. Ho
 * 
 * Lab #9 All problems
 * 
 * Write a program named Dice.java that will do the following:

Ask the user how many times they wish to roll a pair of dice, from 1-999. Validate the input—keep asking until the number is in range. 
Write a method named getNRolls() to do this step. The method takes a Scanner object as its parameter and returns the number of rolls the user desires.

Create a 6 × 6 array named rolls to hold the result of the rolls.

Simulate randomly rolling a pair of dice as many times as the user requested. As you roll the dice, 
count how many times each combination of dice was rolled. For example, 
if the first die is a 3 and the second die is 5, you will add one to the entry at rolls[2][4]. (If you generate numbers in the range 1-6, 
you will have to subtract one at appropriate places. If you generate numbers in the range 0-5, you don’t need to do any subtraction). 
Write a method named rollDice() to do this step. It takes the number of rolls as its parameter and returns the two-dimensional array of rolls.

Print out the array, properly labeled, so that the numbers all line up. You can do this in main() or write a method to do it.

Go through the array you created in step 3 and figure out how many times the dice totaled 2, 3, 4, … 12. 
Write a method called calcFrequencies() to do this. It will take the rolls array as its parameter and return a single-dimensional array of length 11, 
which your main() method will store in an array named totals.

Print the frequency array from step 5, properly labeled. You may do this in main() or write a method to do it.

Yes; I know this is “inefficient.” It is possible to construct the totals array at the same time that you create the rolls array. 
You could do everything in main() without any other methods. However, I want you to practice passing and returning arrays to and from methods, 
so I decided to write the assignment this way.

Sample output:

How many times do you want to roll the dice (1-999)? 200
Frequencies for individual dice
      1   2   3   4   5   6
    ------------------------
1|    3   7   2   3   8   4
2|    4   7   2   5  10   5
3|    9  10   7   4   6   5
4|    6   4   5   7   4   8
5|    3   3   3   8   6   6
6|    5   5   8   7   3   8

Frequencies of totals
 2:   3
 3:  11
 4:  18
 5:  21
 6:  27
 7:  31
 8:  26
 9:  25
10:  21
11:   9
12:   8
 */
import java.util.Scanner;
import java.util.Random;


public class Dice {
	public static int getNRolls (Scanner input) {
		int nRolls;
		
		do {
			System.out.println("How many time do you wish to roll a pair of dice? ");
			while (!input.hasNextInt()) {
				System.out.println("Enter a valid number: ");
				input.next();
			}
		nRolls = input.nextInt();
		
		if  (nRolls < 1 || nRolls > 999) {
			System.out.println("This number is invalid. Please enter a valid number: ");
			}
		} while (nRolls < 1 || nRolls > 999);
			return nRolls;
		}
	
	private static int[][] rollDice(int nRolls) {
		int[][] rolls = new int[6][6];
		
		for (int i = 0; i < nRolls; i++) {
			int die1 = (int) (Math.random() * 6) + 1;
			int die2 = (int) (Math.random() * 6) + 1;
			rolls[die1 - 1][die2 - 1]++;
		
	}
		return rolls;
	}
	
	private static void printArray(int[][] array, String label) {
	    System.out.println(label);
	    System.out.println("      1   2   3   4   5   6");
	    System.out.println("    ------------------------");
	    for (int i = 0; i < array.length; i++) {
	        System.out.printf("%2d |", i + 1);
	        for (int j = 0; j < array[i].length; j++) {
	            System.out.printf("%4d", array[i][j]);
	        }
	        System.out.println();
	    }
	}
	
	private static int[] calcFrequencies(int[][] rolls) {
		int[] totals = new int[11];
		for (int i = 0; i < rolls.length; i++) {
			for(int j = 0; j < rolls[i].length; j++) {
				totals[i + j] += rolls[i][j];
			}
		}
		return totals;
	}
	
	private static void printFrequencies(int[] totals, String label) {
		System.out.println(label);
		for (int i = 2; i <= 12; i++) {
			System.out.printf("%2d: %4d\n", i, totals[i - 2]);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nRolls = getNRolls(input);
		
		int[][] rolls = rollDice (nRolls);
		
		
		printArray(rolls, "Frequencies for individual dice");
		
		int[] totals = calcFrequencies(rolls);
		printFrequencies(totals, "frequencies of totals");
			
		}
}