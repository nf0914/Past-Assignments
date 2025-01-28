/**
 * Niklas Feil-Ho
 * 
 * The Duration Class
Creating a Java class named Duration to represent a time duration. The class contains these private properties:

hours (a non-negative integer)
minutes (an integer in the range 0-59)
Write the following public methods:

A no-parameter constructor that sets both properties to zero.
A two-parameter constructor that sets both properties as specified in the parameters.
Accessors and mutators for the properties.
A toString method that returns a string in the form hh:mm (use as many digits as needed for the hours).
A fromString method that takes a string in the form hh:mm and returns a Duration object. This must be a static method.
An instance method public Duration add(Duration other) that adds this duration to the other duration and returns the result.
The constructors, mutators, and fromString must make sure that hours and minutes do not go out of range. 
If given bad input, the code does not have to give error messages. 
Instead, it creates a valid Duration that might not be what the user intended. 
(We want you to concentrate on using classes here, not error checking).

This class is not a public class.
Here is a UML diagram of the class

             Duration
------------------------------------
-hours: int
-minutes: int
--------------
-minutes: int
+Duration(hours: int, minutes: int)

+getHours (): int
+setHours (hours: int): void

+getMinutes (): int
+setMinutes (minutes: int): void

+tostring(): String
+fromString(str: String): Duration
------------------------------------

+add (other: Duration): Duration
-------------------------------------
 */
public class Duration {
    // TODO: Add private properties for hours and minutes
	private int hours; //represents the number of hours (non-negative)
	private int minutes; // represents the number of minutes (0-59)
    // TODO: Document all methods below in javadoc format including @param,
    //       @return, and @throws tags.
	/**
	 * @param... 
	 * @return...
	 * @throws...
	 */
    // TODO: Add a public no-arg constructor
	/**
	 * Creates a duration object with 0 hours and 0 minutes
	 */
	public Duration() {
		this.hours = 0;
		this.minutes = 0;
	}
    // TODO: Add a public two parameter constructor. Should throw an
    //       InvalidArgumentException if the passed in parameters are invalid.
	/**
	 * Creates a Duration object with the specific hours and minutes 
	 * If the input values are out of range, they will be corrected
	 * 
	 * @param hours   the number of hours (must be non-negative)
	 * @param minutes the number of minutes (must be between 0 and 59)
	 * @throws IllegalArgumentException if hours or minutes are negative and if minutes are greater than 59
	 */
	public Duration(int hours, int minutes) {
		//check for invalid input
		if (hours < 0 || minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Hours and Minutes must be non-negative & in the accepted range");
		}
		
		this.hours = hours;
		this.minutes = minutes;
	}
    // TODO: Add accessors and mutators for the private properties
	/**
	 * Get the number of hours
	 * 
	 * @return the number of hours
	 */
	public int getHours() {
		return hours;
	}
	/**
	 * Set the number of hours
	 * 
	 * @param hours the number of hours (must be non-negative)
	 * @throws IllegalArgumentException if the hours are negative
	 */
	public void setHours(int hours) {
		if (hours < 0) {
			throw new IllegalArgumentException("Hours must be non-negative");
		}
		
		this.hours = hours;
	}
	/**
	 * Gets the number of minutes
	 * 
	 * @return the number of minutes
	 */
	public int getMinutes() {
		return minutes;
	}
	/**
	 * Set the number of minutes
	 * 
	 * @param minutes the number of minutes (must be between 0 and 59)
	 * @throws IllegalArgumentException if the minutes are negative
	 */
	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Minutes must be non-negative and less than 60 ");
		}
		
		this.minutes = minutes;
	}
    // TODO: Add toString method that returns the duration in hh:mm format
	/**
	 * Returns a string representation of the duration in the format hh:mm
	 * 
	 * @return A string in the format hh:mm
	 */
	@Override
	public String toString() {
		return String.format("%02d:%02d", hours, minutes);
	}
    // TODO: Add a static fromString methods that takes in a string of the form hh:mm
    //       and returns a Duration object. Should throw an 
    //       InvalidArgumentException exception if the string cannot be parsed
    //       or if the values are invalid.
	/**
	 * Parses a string in the format hh:mm to create a duration object
	 * If the string is invalid(e.g., wrong format, out of range, etc.) it throws an IllegalArgumentException
	 * 
	 * @param time A string representing the duration in the format hh:mm
	 * @return A duration object with the parsed hours and minutes
	 * @throws IllegalArgumentException if String is invalid
	 */
	public static Duration fromString(String time) {
		//check if string has only 1 colon
		if(time == null || !time.contains(":") || time.indexOf(":") != time.lastIndexOf(":")) {
			throw new IllegalArgumentException("invalid format, hh:mm, String can and needs to have only have one colon");
		}
		String[] parts = time.split(":"); //Splitting the string by colon
		
		//Check that the string was correctly split into exactly two parts
		if (parts.length != 2) {
			throw new IllegalArgumentException("Invalid format. need hh:mm");
		}
		
		
		try {
			int hours = Integer.parseInt(parts[0]); //parse hours
			int minutes = Integer.parseInt(parts[1]); //parse minutes
			
			//check for valid hours and minutes
			if (hours < 0 || minutes < 0 || minutes > 59) {
				throw new IllegalArgumentException("Invalid hours or minutes");
			}
			
			return new Duration(hours,minutes);
			
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid numbers in the input string");
	
		}
	}
    // TODO: Add a add method that takes in a Duration object and adds to this
    //       object.
	/**
	 * Adds the specified Duration to this Duration
	 * This method modifies the current Duration object by adding the additional hours and minutes
	 * from the other Duration
	 * It also handles overflow from minutes by converting them into hours
	 * @param other The Duration object to add to this Duration
	 * @return The current Duration object after adding the other specified Duration
	 */
	public Duration add(Duration other) {
		//adding minutes from both duration objects
		this.minutes += other.getMinutes();
		
		//Accounting for overflow from total minutes
		if (this.minutes >= 60) {
			this.hours += this.minutes / 60; // integrating hours based extra minutes out of range
			this.minutes = this.minutes % 60; //setting minutes to remainder 
		}
		
		//adding hours from both duration objects
		this.hours += other.getHours();
		
		return this;

	}

}


/**
int totalHours = this.hours + other.getHours(); //add hours
int totalMinutes = this.minutes + other.getMinutes(); //add minutes 

//handle overflow of minutes into hours
if (totalMinutes >= 60) {
	totalHours += totalMinutes / 60; //incrementing total hours by number of extra minutes in hours
	totalMinutes = totalMinutes % 60; // setting totalMinutes to the remainder that is within 0-59
}

//return a new Duration object with the total hours and minutes
return new Duration(totalHours, totalMinutes);
**/