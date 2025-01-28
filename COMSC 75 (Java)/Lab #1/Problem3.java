/*
 * Niklas Feil-Haw

 * ID# 1057122
 * December 31, 2023
 * COMSC-075
 * Prof. Ho
 * Lab #1 Problem 3
 * 
 * 3. Chapter 3, Exercise 2
 * Write a program that converts a temperature from Celsius to Fahrenheit. 
 * It should (1) prompt the user for input, 
 * (2) read a double value from the keyboard, 
 * (3) calculate the result, and 
 * (4) format the output to one decimal place. When it’s finished, it should work like this:
 * Enter a temperature in Celsius: 24
 * 24.0 C = 75.2 F
 * Here is the formula to do the conversion:
 * F = C × 9/5  + 32 
 * Hint: Be careful not to use integer division!
*/
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Celcius: ");
		double Celsius = input.nextDouble();
		double Fahrenheit = Celsius * 9/5 + 32; // Implementing given formula
		
		System.out.println(Celsius + " C = " + Fahrenheit + " F" );
		

	}

}
