/**
 * Niklas Feil-Ho
 * 
 * The first class, LinearEquation, represents a linear equation of the form ax + b = 0. 
 * (Thus, the coefficients array will have two entries.) It has two constructors:
 * public LinearEquation(double[] coefficients)
 * public LinearEquation(double a, double b) // used to populate the coefficients property
 * Implementing the findSolution() method, which will return an array of one double with the solution. 
 * Also, implement a toString() method that returns a string in the form ax + b = 0 where both the 
 * numbers are displayed with two digits to the right of the decimal point.
 * 
 * UML Diagram
 * 
 * LinearEquation
 * -------------------
 * +LinearEquation(coefficients: double[])
 * +LinearEquation(a: double, b: double)
 * +find solution(): double[]
 * 
 * +toString(): String
 */
public class LinearEquation extends Equation {
    /**
     * Creates a linear equation with the given coefficients
     * TODO: Put in the correct @param clause.
     */
    public LinearEquation(double a, double b) {
        // TODO: Implement this method.
    	//using superclass constructing to initialize coefficients array
    	super(new double[] {b, a}); 
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Creates a linear equation with two coefficients.
     * TODO: Put in the correct description of params and throws clause in javadoc.
     * 
     * @param coefficients an array containing exactly two coefficients [a, b]
     * @throws IllegalArgumentException if the coefficients array does not have exactly two elements
     */
    public LinearEquation(double[] coefficients) {
        /* TODO: Complete this method. NOTE: This method should throw an 
         * InvalidArgumentException if the passed in coefficients are invalid
         */
    	super(coefficients);
    	if (coefficients.length != 2) {
    		throw new UnsupportedOperationException("Not supported yet.");
    	}
    }

    /**
     * TODO: Finds the solution for the linear equation.
     * Add an @return tag that shows how many solutions would be there etc.
     * 
     * @return an array containing one double representing the solution x = -b/a
     * @throws IllegalArgumentException when a == 0; divide by 0
     */
    @Override
    public double[] findSolution() {
        // TODO: Implement this method.
    	double a = getCoefficients()[1];
    	double b = getCoefficients()[0];
    	
    	if(a == 0) {
        throw new UnsupportedOperationException("Not supported yet.");
    	}
    	double solution = -b / a;
    	return new double[] {solution};
    }

    /**
     * TODO: Add a description for this method.
     * 
     * Returns a string representing linear equation (ax + b = 0)
     * 
     * @return a formatted string representing linear equation
     */
    @Override
    public String toString() {
        // TODO: Implement this method.
    	double a = getCoefficients()[1];
    	double b = getCoefficients()[0];
    	
    	return String.format("%.2fx + %.2f = 0", b, a );
       // throw new UnsupportedOperationException("Not supported yet.");
    }
}