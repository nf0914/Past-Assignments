/**
 * Niklas Feil-Ho
 * 
 * Interfaces
 * 
 * Triangle Constructor:
 * Triangle will take the length of the 3 sides
 * Will throw a RuntimeException if the values passed are incorrect. 
 * The class will also implement the getArea and getPerimeter function.
 */

public class Triangle implements GeometricObject {
	private double length1;
	private double length2;
	private double length3;
	
	/**
	 * Constructs a Triangle with the three specified lengths 
	 * 
	 * @param length1 the length of the first side
	 * @param length2 the length of the second side
	 * @param length3 the length of the third side
	 * @throws IllegalArgumentException if any of the values are less than or equal to 0
	 */
	
	public Triangle(double length1, double length2, double length3) {
		if (length1 <= 0 ||length2 <= 0 || length3 <= 0) {
			throw new IllegalArgumentException("The lengths need to be positive");
		}
		if (length1 + length2 <= length3 || length1 + length3 <= length2 || 
				length2 + length3 <= length1) {
			throw new IllegalArgumentException("The sum of two sides must be larger than the third");
		}
		
		this.length1 = length1;
		this.length2 = length2;
		this.length3 = length3;
	}
	
	/**
	 * Returning the perimeter of the triangle with the given lengths
	 * 
	 * @return perimeter of the triangle using sum of lenght1 + length2 + length3))
	 */
	public double getPerimeter() {
		return (length1 + length2 + length3);
	}
	
	/**
	 * Returning the Area of the triangle with the given lengths
	 * 
	 * @param sPerimeter the semi perimeter of a triangle 1/2 * perimeter
	 * @return Area of the triangle using Heron's formula sqrt ( P(p -length1)(p -length2)(p - length3))
	**/
	public double getArea() {
		double sPerimeter = (0.5) * (length1 + length2 + length3);
		return Math.sqrt(sPerimeter * (sPerimeter - length1) * (sPerimeter - length2) * (sPerimeter - length3));
	}
}