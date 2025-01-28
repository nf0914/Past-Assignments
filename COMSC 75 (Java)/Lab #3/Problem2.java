/*
 *  * Niklas Feil-Haw
 * ID# 1057122
 * January 4, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #3 Problem 2
 * 
 * 2. Write a program that asks the name of the student and then calculates the grade for the class. 
 * Then it prints out the grade of the student
 * You need a while loop for this program because the program continues to run until you type 0 to quit. 
 * Grading 
 * > 90% = A
 * > 80% = B
 * > 70% = C
 * > 60% = D
 * < 60% = F

*You need to enter the scores for each following types of assignment.

*Homework = 0 to 50
*Midterm = 0 to 200
*Lab = 0 to 100
*Final = 0 to 150

*Total score for the class should be between 0 and 500

*A sample output might look like this

*Name of Student: (Enter 0 to quit) Jack
*Total scores for Homework (out of 50): 50
*Total scores for Midterm (out of 200): 200
*Total scores for Lab (out of 100): 100
*Total scores for Final (out of 150): 135
*Total scores for the class (out of 500): 485
*Jack got a(n) A for this class
*Name of Student: (Enter 0 to quit) 0

*Could you use both if/else and switch statements for selection? Which one works better? Why? 

 */
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Grade Calculator");
		
		String name = "";
		while (!name.equals("0")) {
			System.out.print("What is your name? (Enter 0 to quit) ");
			name = input.nextLine();
			
			if (!name.equals("0")) {
			System.out.print("Total score for Homework(out of 50): " );
			double Homework = input.nextDouble();
			if (Homework > 50) {
				System.out.println("Homework score must be less than or equal to 50");
			}	else {
				System.out.print("Total score for Midterm(out of 200): " );
				double Midterm = input.nextDouble();
				if (Midterm > 200) {
					System.out.println("Midterm score must be less than or equal to 200");
				}	else {
					System.out.print("Total score for Lab(out of 100): " );
					double Lab = input.nextDouble();
					if (Lab > 100) {
						System.out.println("Lab score must be less than or equal to 100");
					}	else { 
						System.out.print("Total score for Final(out of 150): " );
						double Final = input.nextDouble();
						if (Final > 150) {
							System.out.println("Final score must be less than or equal to 150");
						}	else {
							double Score = Homework + Midterm + Lab + Final;
							
							if (Score < 300) {
								System.out.println( name + " got a(n) F for this class");
							} else if (Score < 350) {
								System.out.println( name + " got a(n) F for this class");
							} else if (Score < 350) {
								System.out.println( name + " got a(n) D for this class");
							} else if (Score < 400) {
								System.out.println( name + " got a(n) C for this class");
							} else if (Score < 450) {
								System.out.println( name + " got a(n) B for this class");
							} else if (Score <= 500) {
								System.out.println( name + " got a(n) A for this class");
										
						}	
					}
				}
			}
			
			}
			input.nextLine();
		}
	
	}
	
}
}
