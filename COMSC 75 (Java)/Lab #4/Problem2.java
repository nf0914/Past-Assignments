/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 11, 2024
 * COMSC-075
 * Prof. Ho
 * Lab 4 Problem 2
 * 
 * 2. Write a class method named areFactors that takes an integer n and an array of integers, 
 * and that returns true if the numbers in the array are all factors of n (which is to say that n is divisible by all of them).

Your method would look something like this:
    public static boolean areFactors (int n, int[] f) {
         for (int i = 0;i<f.length;i++) {
                // if n is not divisible by an element in f, then return false
           ...
}
 */
import java.util.Scanner;

public class Problem2 {
	public static boolean areFactors(int n, int[] integers) {
		for (int numbers : integers) {
			if (numbers % n != 0) {
				return false;
		}
		}
		return true;
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a series of integers separated by spaces: ");
		
		String [] StringNumbers = input.nextLine().split(" ");
		
		int[] StringNowInt = new int[StringNumbers.length];
		for (int i = 0; i < StringNumbers.length; i++) {
			StringNowInt[i] = Integer.parseInt(StringNumbers[i]);
		}
		System.out.println("Enter an integer to see if the numbers in the array are all factors of this number: ");
		int FactorOfN = input.nextInt();
		
		if (areFactors(FactorOfN, StringNowInt)) {
			System.out.println("All integers in the array are a factor of " + FactorOfN);
	}	else {
			System.out.println("Atleast one of the integers are not a factor of " + FactorOfN);
	}
	}
}
