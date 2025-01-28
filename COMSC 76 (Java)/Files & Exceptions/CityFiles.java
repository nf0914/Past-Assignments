import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  
 * @author Prof. Balaji Srinivasan
 * @author Niklas Feil-Ho
 */
public class CityFiles {

    /**
     * The status for the sortPopulation operation.
     */
    public enum Status {
        SUCCESS, // Returned when operation completes successfully.
        INPUT_FILE_EXCEPTION, // Returned when input file could not be opened.
        OUTPUT_FILE_EXCEPTION, // Returned if output file could not be opened or written to.
        BADLY_FORMATTED_LINE // Returned when the line is not formatted correctly in the input file
    };

    /**
     * Processes the given input file and sorts the cities in alphabetical order.
     * @param in The input file name.
     * @param out The output file name.
     * @return The return status which should be one of the enum values above.
     */
    public static Status sortPopulation(String in, String out) {
        // TODO: Implement this method and make sure you catch the appropriate exceptions
        // and return the right Status codes above.
    	ArrayList<City> cities = new ArrayList<>();
    	
    	try (BufferedReader reader = new BufferedReader(new FileReader(in))) {
    		String line;
    		while ((line =reader.readLine()) != null) {
    			String[] parts = line.split(",");// split the lines into city name, state, population
    			
    			if (parts.length != 3) { // check if line has exactly 3 parts
    				return Status.BADLY_FORMATTED_LINE;
    			}
    			//check if its a valid number
    			try {
    				int population = Integer.parseInt(parts[2]);
    				City city = new City(parts[0], parts[1], population);
    				cities.add(city);
    			} catch (NumberFormatException e) {
    				return Status.BADLY_FORMATTED_LINE;
    			}
    		}
    	} catch (IOException e) {
    		return Status.INPUT_FILE_EXCEPTION;
    	}
    	// sort the cities alphabetically by name, state, and population
    	Collections.sort(cities);
    	
    	//try opening the output file
    	try (BufferedWriter writer = new BufferedWriter(new FileWriter(out))) {
    		for (City city : cities) {
    			
    			writer.write(city.toString());
    			writer.newLine();
    		} 
    	} catch (IOException e) {
    		return Status.OUTPUT_FILE_EXCEPTION;
    	}
    	
    	return Status.SUCCESS;
        //throw new UnsupportedOperationException("Method not implemented");
    }
}
