/**
 * 
 * Niklas Feil-Ho
 * 
 * This is the Equation class which represents an equation by the coefficient(s) of a variable x and its powers, 
 * and has an abstract findSolution() method that returns an array of double giving the root(s) of the equation. 
 * I will write two concrete classes that extend this abstract class
 * The UML Diagram of this class will be shown below:
 * 
 *     Equation
 * ----------------
 * coefficients: double[]
 * ----------------------------------
 * +Equation()
 * +Equation(coefficients: double[])
 * 
 * +findSolution(): double[]
 */
public abstract class Equation {
	private double[] coefficients;
	/**
	 * Default constructor for Equation
	 */
	public Equation() {
		// doesn't initialize the coefficients array directly

	}
	
	/**
	 * Constructs an Equation with the given coefficients
	 * 
	 * @param coefficients an array of coefficients for the equation
	 * @throws IllegalArgumenrtException if array is null or empty
	 */
	public Equation(double[] coefficients) {
		setCoefficients(coefficients); //initializes the coefficients array
	}
	/**
	 * Returns the coefficients of the equation
	 * 
	 * @return an array of doubles representing the coefficients 
	 */
	public double[] getCoefficients( ) {
		return coefficients;
	}
	
	/**
	 * sets the coefficients for the equation 
	 * 
	 * @param coefficients an array of coefficients for the equation
	 * @throws IllegalArgumentException if the coefficients array is null or empty 
	 */
	public void setCoefficients(double[] coefficients) {
		if(coefficients == null || coefficients.length == 0 ) {
			throw new IllegalArgumentException("Coefficients array cannot be null or empty");
		}
		this.coefficients = coefficients;
	}
	
	/**
	 * Abstract method that finds the solution(s) to the equation
	 * this method must be implemented by the subclasses
	 * 
	 * @return an array of doubles representing the root(s) of the equation
	 * 
	 */
	public abstract double[] findSolution();

}
