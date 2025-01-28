/**
 * 
 * Niklas Feil-Ho
 * 
 * The second class, QuadraticEquation, represents a quadratic equation of the form ax2 + bx + c = 0. 
 * (Thus, the coefficients array will have three entries.) It has two constructors:
 * public QuadraticEquation(double[] coefficients)
 * public QuadraticEquation(double a, double b, double c) // used to populate the coefficients property
 * 
 * UML Diagram
 * 
 *                 QuadraticEquation
 * -----------------------------------------------------
 * +QuadraticEquation(coefficients: double[])
 * +QuadraticEquation(a: double, b: double, c: double)
 * +findSolution(): double[]
 * 
 * toString(): String
 *
 */
public class QuadraticEquation extends Equation {
    /**
     * Creates a quadratic equation with the given coefficients.
     * TODO: Put in the correct @param clause.
     * 
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant
     */
    public QuadraticEquation(double a, double b, double c) {
        // TODO: Implement this method.
    	super(new double[] {c, b, a}); // TODO: Fix this line also.
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Creates a quadratic equation with three coefficients.
     * TODO: Put in the correct description of params and throws clause in javadoc.
     * 
     * @param coefficients an array containing three coefficients [a, b, c]
     * @throws IllegalArgumentException if there isn't exactly 3 elements in the array
     */
    public QuadraticEquation(double[] coefficients) {
        /* TODO: Complete this method. NOTE: This method should throw an 
         * InvalidArgumentException if the passed in coefficients are invalid
         */
    	super(coefficients);
    	if (coefficients == null || coefficients.length != 3) {
    	throw new IllegalArgumentException("Quadratic Equation must have exactly 3 coefficients");
    }
    }

    /**
     * TODO: Add a description here including @return tag.
     * 
     * @return an array containing two doubles representing the solutions for x based on the quadratic formula
     * @return only only one solution when d == 0
     * @throws IllegalArgumentException when a == 0, divide by 0
     */
    @Override
    public double[] findSolution() {
        // TODO: Implement this method.
    	double a = getCoefficients()[2];
    	double b = getCoefficients()[1];
    	double c = getCoefficients()[0];
    	
    	if (a == 0 ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    	
    	double d = (b * b) - (4 * a * c);
    	
    	if (d < 0 ) {
    		throw  new IllegalArgumentException("Not Supported yet.");
    	} else if (d == 0) {
    		double solution = - b / ( 2 * a);
    		return new double[]{solution};
    	} else {
    	
    	double solution1 = ( - b - d) / (2 * a);
    	double solution2 = ( - b + d) /  (2 * a);
    	return new double[]{solution1, solution2};
    }
    }
    	

    /**
     * TODO: Add a description for this method.
     * 
     * Returns a String representing the Quadratic Equation ax^2 + bx + c = 0
     * 
     * @return a formatted string representing quadratic equation
     */
    @Override
    public String toString() {
        // TODO: Implement this method.
    	double a = getCoefficients()[2];
    	double b = getCoefficients()[1];
    	double c = getCoefficients()[0];
    	
    	return String.format("%.2fx^2 + %.2fx + %.2f = 0", c, b , a);
    	
       // throw new UnsupportedOperationException("Not supported yet.");
    }
}
