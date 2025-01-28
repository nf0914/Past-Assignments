/*
 * Niklas Feil-Haw
 * ID# 1057122
 * December 31, 2023
 * COMSC-075
 * Prof. Ho
 * Lab #1 Problem 1
 * 
 * 1. Write a program that reads a 3-digit integer and calculates the sum of all the digits.
 * For example, if the number is 789, the sum of all digits is 24. 
 * 
 * Hint: use the % to extract the digits and then use / to help you extract the next one. 
 * For example, 789 % 10 = 9 and 789 / 10 = 78
 */
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the 3-digit integer: ");
		int integer = in.nextInt();
		int first = (integer % 10); // value of the first integer
		int second = (integer % 100 / 10); // value of the second integer
		int third = (integer % 1000 / 100); // value of the third integer
		int sum = first + second + third; // summing the integers together
		
		System.out.println("The sum of the 3 digits within the integer equals " + sum);

	}

}
