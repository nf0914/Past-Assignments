/*
 *  Niklas Feil-Ho
 * ID# 1057122
 * January 12, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #5 Problem 1 
 * 
 * 1. Exercise 9-3

Many encryption algorithms depend on the ability to raise large integers to a power. 
Here is a method that implements an efficient algorithm for integer exponentiation:

public static int pow(int x, int n) 
{ 
if (n == 0) return 1; 
// find x to the n/2 recursively 
int t = pow(x, n / 2); 
// if n is even, the result is t squared 
// if n is odd, the result is t squared times x 
if (n % 2 == 0) { 
return t * t; 
} else { 
return t * t * x; 
} 
}

The problem with this method is that it works only if the result is small enough to be represented by an int. 
Rewrite it so that the result is a BigInteger. The parameters should still be integers, though.

You should use the BigInteger methods add and multiply. But don’t use BigInteger.pow; that would spoil the fun.
 */
import java.math.BigInteger;
import java.util. Scanner;



public class Problem1 {
	
	public static BigInteger pow(int x, int n) {
		if (n == 0) {
			return BigInteger.ONE;
		}
		BigInteger t = pow(x, n/2);
		if (n % 2 == 0) {
			return t.multiply(t);
		} else {
			return t.multiply(t).multiply(BigInteger.valueOf(x));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value that represents the base of an exponent: ");
		int Base = input.nextInt();
		
		System.out.println("Enter a value that represents the exponential factor of the exponent: ");
		int Exponent = input.nextInt();
		
		BigInteger Result = pow(Base, Exponent);
		System.out.println("Base: " + Base);
		System.out.println("Exponent: " + Exponent);
		System.out.println("BigInteger Result: " + Result);
		System.out.println(Base + " ^ " + Exponent + " = " + Result);
	
	}

}
