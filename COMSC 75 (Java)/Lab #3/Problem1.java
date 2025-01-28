/*
 * Niklas Feil-Haw
 * ID# 1057122
 * January 4, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #3 Problem 1
 * 1. To determine the focal length of a camera lens, you use this
 * formula:
 * 1 / f  = 1 / do + 1 / di
 * Where do is the distance from the object to the lens and 
 * di is the distance from the lens to the camera’s image sensor.
 * Write a program that implements a method named reciprocal, which takes
 * a double x as its parameter and returns 1.0 / x (the reciprocal).
 * The main method will
 * - ask the user for the distance to the object in meters, and the distance to the image sensor in centimeters
 * - calculate and display the focal length in millimeters.
 * Use the reciprocal method in your calculation. Remember to do the unit conversion so that both distances
 * are in millimeters (mm). There are 1000 mm in a meter and 10 mm in a centimeter.
 * Here is what the program output might look like:
 * Enter distance from object to lens in meters: 3.8
 * Enter distance from lens to image sensor in cm: 9.5
 * The focal length is 92.68 mm.
 */
import java.util.Scanner;

public class Problem1 {

	public static double getRecipricol(double d_o, double d_i) {
		double f = 1 / (1/d_o + 1/d_i);
		return f;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance from object to lens in meters: ");
		double d_o = input.nextDouble();
		
		System.out.print("Enter distance from lens to image sensor in cm: ");
		double d_i = input.nextDouble();
		
		double f = 1 / ((1/(d_o *1000) + 1 / (d_i*10)));
		
		System.out.printf("The focal length is %.2f" + " mm", f );

	}

}
