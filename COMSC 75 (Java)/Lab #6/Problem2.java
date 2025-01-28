/* Niklas Feil-Haw
 * ID# 1057122
 * January 15, 2024
 * COMSC-075
 * Prof. Ho
 * Lab #6 Problem 2
 * 
 * 2. Take a look at this UML diagram about a Rectangle. Please write a class that matches the UML diagram

Rectangle_UML.png

+ sign = public,  - sign = private,   black underline = static   (ignore the red underline. Those are spell check lines)

A rectangle is a 4-sided shape with 4 right angles. When the length and width are the same, it is also called a square. 
 */
public class Problem2 {
	private double length;
	private double width;
	public static int numRect;

	public Problem2() {
		this.length = 0;
		this.width = 0;
		numRect++;
	}
	
	public Problem2(double length, double width) {
		this.length = length;
		this.width = width;
		numRect++;
		
	}
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public static int getNumRect() {
		return numRect;
		
	}
	
	public double getArea() {
		return length * width;
		
	}
	
	public boolean isSquare() {
		return length == width;
	}
	public static void main(String[] args) {
		Problem2 rect1 = new Problem2(3,5);
		System.out.println("Area of the rectangle: " + rect1.getArea());
		System.out.println("The rectangle is a square: " + rect1.isSquare());
		System.out.println("Number of rectangles created: " + Problem2.getNumRect());

	}

}
