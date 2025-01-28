/*
 *  Niklas Feil-Haw
 * ID# 1057122
 * January 12, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #5 Problem 2
 * 
 * 2. 

Write a command-line program that accepts two numbers and
a string representing an arithmetic operation: "plus", "minus", "times", and
"div" in either upper or lower case and evaluates the resulting expression.
Examples of running the program (source in Calc.java) several times:
74 Chapter 9 Immutable Objects
> java Calc
Usage: number plus|minus|times|div number
> java Calc 3 plus 4.5
7.5
> java Calc 7.5 div 2
3.75
> java Calc 6 MINUS 1.25
4.75
> java Calc 7 blah 5
Unknown operation blah
The reason this program uses words instead of the symbols +, -, *, and / is
that some of these characters are interpreted by the MacOS, Windows, and
Linux command lines as wild card characters or part of a file name.
 */
import java.util.Scanner;


public class Problem2 {
	public static double MathOperations(double num1, double num2, String Actions) {
		Actions = Actions.toLowerCase();
		switch (Actions) {
			case "plus":
				return   num1 + num2;
			case "minus":
				return  num1 - num2;
			case "times": 
				return num1 * num2;
			case "div":
				if (num2 == 0) {
					System.out.println("Cannot divide by 0");
					return Double.NaN;
				}
				return num1 / num2;
			default:
				System.out.println("Does not include an acceptable mathematical operation: " + Actions);
				return Double.NaN;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter: your first value: ");
			double num1 = input.nextDouble();
			
			System.out.println("Enter the mathematical operation(plus, minus, times, div): ");
			String Actions = input.next();
			
			System.out.println("Enter your second value: ");
			double num2 = input.nextDouble();
			
			double Result = MathOperations(num1, num2, Actions);
			
			System.out.println(num1 + " " + Actions + " " + num2 + " = " + Result);
			
			System.out.println("Would you like to exit the program?(yes/no): ");
			String Choice = input.next().toLowerCase();
			
			if ( Choice.equals("yes")) {
				System.out.println("You have now exited the program");
				break;
			}
	
		}
	
	}
}
