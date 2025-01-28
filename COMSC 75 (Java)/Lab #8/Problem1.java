/*
 * Niklas Feil-Haww
 * Id # 1057122
 * January 18, 2024
 * COMSC - 075
 * Prof. Ho
 * 
 * Lab 8 Problem 1
 * 
 * 1. Write the following method that returns the sum of all numbers in an ArrayList

public static int sumList (List <Integer> list)

Now write another method sumDoubleList that takes in an arraylist of double values and returns a double. 
Test using both an array list of double values and integer values. Make sure that the results are correct.

 */
import java.util.List;


public class Problem1 {
	
	public static  int listSum (List <Integer> list) {
		int sum = 0;
		for(int num : list ) {
			sum += num;
		}
		return sum;
	}
		
		public static double doubleListSum (List<Double> doubleList) {
			double sum = 0.0;
			for (double num : doubleList) {
				sum += num;
			}
			return sum;
		}
		

	public static void main(String[] args) {
		List <Integer> integerList = List.of(7, 14, 21, 28, 35);
		int intSum = listSum(integerList);
			System.out.println("The sum of the integers = " + intSum);
		
		List <Double> doubleList = List.of(2.5, 5.0, 7.5, 10.0, 12.5);
		double doubleSum = doubleListSum(doubleList);
			System.out.print("The sum of the double values = " + doubleSum);

	}

}
