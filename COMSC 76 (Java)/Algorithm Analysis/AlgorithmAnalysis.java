import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * This class analyzes the time complexity of the ArrayList.indexOf() method 
 * by measuring the average time taken to search for random elements in 
 * ArrayLists of various sizes.
 *
 */

public class AlgorithmAnalysis {

	public static void main(String[] args) {
		int[] sizes = {1000, 10000, 100000, 1000000, 10000000}; //ArrayList sizes
		
		Random random = new Random(); //selecting random integers
		
		//looping over each size to create ArrayList & measures performance time
		for (int size: sizes) {
			ArrayList<Integer> list = createArrayList(size);
			
			
			long totalTime = 0; //initialized time & accumulates time
			
			//performs 10,000 iterations to obtain time data
			for (int i = 0; i < 10000; i++) {
				
				int randomNumber = random.nextInt(size);//generates random number
				
				long startTime = System.nanoTime();// record start time
				
				list.indexOf(randomNumber);//searches for number
				
				long endTime = System.nanoTime();//record end time after search is completed
				
				totalTime += (endTime - startTime);//total time taken during search
			}
			//average time in nanoseconds
			double averageTime = totalTime / 10000.0;
			
			// nanoseconds to microseconds
			double averageTimeMs = averageTime / 1_000;
		
		System.out.println("Average time for indexOf() with created ArrayList of size: " + size 
				+ ": " + averageTimeMs + " microseconds" );
		}

	}
    /**
     * Creates and fills an ArrayList of the specified size with sequential integers.
     *
     * @param size The size of the ArrayList to be created.
     * @return The populated ArrayList containing integers from 0 to size - 1.
     */
	
	public static ArrayList<Integer> createArrayList(int size) {
		ArrayList<Integer> list = new ArrayList<>(size); // initialize ArrayList with given size
		for (int i = 0; i < size; i++) {
			list.add(i); //filling ArrayList with sequential integers
		}
		return list;
	}

}
