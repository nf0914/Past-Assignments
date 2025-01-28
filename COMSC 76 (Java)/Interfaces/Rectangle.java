/**
 * Niklas Feil-Ho
 * 
 * Interfaces
 * 
 * Rectangle Constructor:
 * Rectangle will take the lengths of the width and the height
 * Will throw a RuntimeException if the values passed are incorrect. 
 * The class will also implement the getArea and getPerimeter function.
 */

public class Rectangle implements GeometricObject {
	private double width;
	private double height;
	
	/**
	 * constructs a rectangle with the specified width and height
	 * 
	 * @param width the width of the rectangle, must be positive
	 * @param height the height of the rectangle, must be positive
	 * @throws IllegalArgumentException if the width or height is negative or 0
	 */
	
	public Rectangle(double width, double height) {
		if (width <= 0 || height <= 0) {
			throw new IllegalArgumentException("Width and Height must be positive");
		}
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Returning the area of the Rectangle 
	 * 
	 * @return area of the Rectangle using width * height
	 */
	public double getArea() {
	return width * height;
	}
	
	/**
	 * Returning the perimeter of the Rectangle
	 * 
	 * @return perimeter of the rectangle using 2 * width + 2 * height
	 */
	public double getPerimeter() {
		return (2 * width) + (2 * height);
	}
}
