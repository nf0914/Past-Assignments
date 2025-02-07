/*
 * Niklas Feil-Ho
 * ID# 1057122
 * January 20, 2024
 * COMSC-075
 * Prof. Ho
 * 
 * Lab #10 All problems
 * 
 * Write a program named TestAverages.java that asks the user for the name of an input file that has people's names and test scores. 
 * Each line has the person's name, a colon, and a list of scores separated by commas.

Next, the program asks the user for the name of an output file. 
The program will then read the input file and write a new output file with the names and their average scores, 
including the number of tests on which it is based.

Error Handling
If the input file does not exist or cannot be opened, print an appropriate error message.
If the output file cannot be opened, print an appropriate error message.
If an input line has a non-numeric entry for a score, print an error message to the screen with the bad data and skip that score.
If an input line has no scores, print an appropriate message to the screen.
 */

import java.util.Scanner;
import java.io.*;

public class TestAverages {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input file name with test scores: ");
		String inputFile = input.nextLine();
		
		System.out.println("Enter output file name for averages: ");
		String outputFile = input.nextLine();
		
		try {
			
			Scanner openInput = new Scanner(new File(inputFile));
			
			PrintWriter openOutput = new PrintWriter(new File(outputFile));
			
			while (openInput.hasNextLine()) {
				String line = openInput.nextLine();
				
				String[] segments = line.split(":");
				String name = segments[0].trim();
				if (segments.length > 1) {
					String[] scores = segments[1].split(",");
					int count = 0;
					double total = 0.0;
					
					for (String score : scores) {
						try {
							double nScore = Double.parseDouble(score.trim());
							total += nScore;
							count++;
						}catch (NumberFormatException e) {
							System.out.println("Ignoring bad number " + score + " for " + name);
							
						}
					}
					if (count > 0) {
						double avg = total/ count;
						openOutput.println(name + ": " + String.format("%.2f", avg) + " (" + count + " tests)");
					} else {
						System.out.println("No numbers found on line " + name + ":");
					}
				}
				
			}
			openInput.close();	
			openOutput.close();
			System.out.println("File " + outputFile + " written successfully. ");
			
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file " + inputFile);
		} catch (IOException e) {
			System.out.println("IO Error: " + outputFile + " (" + e.getMessage() + ")");
			
			
			
		}

	}

}
