/*
 * Niklas Feil-Ho
 * ID# 1057122
 * January 11, 2024
 * COMSC-075
 * Prof. Ho
 * Lab 4 Problem 1
 * 
 * 1. Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. 
 * Can you write this method by using an enhanced for loop? Why or why not?
 */
import java.util.Scanner;
public class Problem1 {
	
	public static int indexOfMax(int[] numbers) {
		int Max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > Max) {
				Max = numbers[i];
			}
		}
		return Max;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("insert a series of numbers separated by a space: ");
		
		String[] StringNumbers = input.nextLine().split(" ");
		
		int[] StringNowInt = new int[StringNumbers.length];
		for (int i = 0; i < StringNumbers.length; i++) {
			StringNowInt[i] = Integer.parseInt(StringNumbers[i]);
		}
		int MaxNumber = indexOfMax(StringNowInt);
		System.out.println("The maximum value in the array is " + MaxNumber);
		
	}

}//Can you write this method by using an enhanced for loop? Why or why not?
//You can use an enhanced for loop, as we are already using a for loop and we are iterating over elements in an array.
//It could have been useful to use an enhanced for loop instead
