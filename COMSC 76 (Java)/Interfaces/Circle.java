/**
 * Niklas Feil-Ho
 * 
 * Interfaces
 * 
 * Circle Constructor:
 * Circle will take the radius
 * Will throw a RuntimeException if the values passed are incorrect. 
 * The class will also implement the getArea and getPerimeter function.
 */

public class Circle implements GeometricObject {
	private double radius;

/**
 * Constructs the area with the given radius
 * 
 * @param radius the radius of the circle
 * @throws IllegalArgumentException if the radius is less than or equal to 0
 */
	public Circle(double radius) {
		if (radius <= 0) {
			throw new IllegalArgumentException("Radius must be positive");
			}
			this.radius = radius;
		}
	
	/**
	 * Returning the Area of a circle
	 * 
	 * @return area of the circle using pi * r^2
	 */
		public double getArea() {
			return Math.PI * radius * radius;
		}
		
	/**
	 * Returning the perimeter of a circle
	 * 
	 * @return perimeter of a circle using 2 * pi * r
	 */
		public double getPerimeter() {
			return 2 * Math.PI * radius; 
		}
		}
