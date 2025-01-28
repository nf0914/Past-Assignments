/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 1, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #2 Problem 1
 * 
 * The goal of this exercise is to show the need for planning a program.
 * The calculations themselves are not sophisticated,
 * but figuring out what those calculations are requires some thinking.
 * Consider a staircase made of concrete as shown in the following diagram, 
 * which depicts a four-step staircase.  
 * The dimensions of the staircase are called the width (width of each step), 
 * the run (the depth of each step), and the rise (the height of each step):
 * Diagram of staircase showing rise (step height) run (depth) and width
 * Your job is to write a program named Staircase.java that prompts the user for the number of 
 * steps in the staircase. 
 * It will then prompt for and read the width, rise, and run of a step in centimeters. 
 * The program will then calculate the number of cubic centimeters of concrete necessary to 
 * build the staircase. Round the number of cubic centimeters by adding 0.5 to the calculated 
 * volume and then casting that result to an integer. In general,
 * double x;
 * int xRounded = (int) (x + 0.5);
 * Calculate by hand what the result of this code would be when x is 3.4 and again 
 * when x is 3.6 to understand why this code works.
 * Hints: How many “blocks” the size of the bottom step do you need to build the staircase? 
 * Drawing a diagram really helps. To find the sum of the numbers 1 through n, use this formula:
 * Here is what program output might look like:
 * Staircase Volume Calculator
 * How many steps in the staircase? 5
 * Enter step width in cm: 45
 * Enter rise of the step in cm: 7.5
 * Enter run of the step in cm: 20
 * Total volume is 101250 cubic centimeters.
 * The name of your Java class must be Staircase. 
 * Remember to include comments at the beginning of your program that give your name, 
 * the date, and a description of the program’s purpose. 
 * The description must be sufficient for someone who has not read the assignment to be able to 
 * understand what the program does.
 * When you finish, upload the Staircase.java file.
 * */
import java.util.Scanner;

public class Staircase {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Staircase Volume Calculator");
		System.out.print("How many steps are in the staircase?: ");
		double steps = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter step length in cm: ");
		double length = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter step width in cm: ");
		double width = input.nextDouble();
		input.nextLine();
		
		System.out.print("Enter step height in cm: ");
		double height = input.nextDouble();
		input.nextLine();
		
		double Volume = (steps * (steps + 1) / 2) * (length * width * height);
		int Volume_Rounded = (int) (Volume + 0.5);
		
		System.out.println("The total volume of the staircase is " + Volume_Rounded + " cm");
	}

}
